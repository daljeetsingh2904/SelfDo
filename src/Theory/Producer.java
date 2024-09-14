package Theory;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}	
	
	
	public void run() {
		for(int i=0;i<100;i++) {
			try {
				queue.put(i);
				System.out.println("Produced --> "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}


}
