package Thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample {

	public static void main(String[] args) {
		Queue<Integer> sharedQueue = new LinkedList<>();
		int maxSize = 10;

		Producer produce = new Producer(sharedQueue, maxSize);
		Consumer consume = new Consumer(sharedQueue);

		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.submit(produce);
//		executor.submit(produce);
		executor.submit(consume);
//		executor.submit(consume);

		executor.shutdown();

	}

}

class Producer implements Runnable {
	private final Queue<Integer> sharedQueue;
	private final int maxSize;

	public Producer(Queue<Integer> sharedQueue, int maxSize) {
		this.sharedQueue = sharedQueue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == maxSize) {
					try {
						System.out.println("Queue is full ,producer is waiting!");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						System.out.println("thread is interuupted !");
					}
				}

				int number = produce();
				sharedQueue.add(number);
				System.out.println("Produced: " + number);
				sharedQueue.notifyAll();
			}
		}
	}

	private int produce() {
		return (int) (Math.random() * 100);
	}
}

class Consumer implements Runnable {
	private final Queue<Integer> sharedQueue;

	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
         public void run() {
      	   while(true) {
      		   synchronized (sharedQueue) {
					while(sharedQueue.isEmpty()) {
						try {
							System.out.println("Queue is empty ,sonsumer is waiting!");
							sharedQueue.wait();
						}catch (InterruptedException e) {
								Thread.currentThread().interrupt();
								System.out.println("thread is interuupted !");
						}
					}
					
					 int number = sharedQueue.poll();
		                System.out.println("Produced: " + number);
		                sharedQueue.notifyAll();
				}
      	   }
     }
}