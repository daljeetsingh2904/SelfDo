package Theory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsDemo {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(100);
		
		Thread producerThread=new Thread(new Producer(queue));
		Thread consumerThread=new Thread(new Consumer(queue));
		
		producerThread.start();
		consumerThread.start();
		
		
	}
}
