package Theory;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	  public Consumer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}



	private BlockingQueue<Integer> queue;

	    

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                Integer item = queue.take();
	                System.out.println("Consumed: " + item);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
}
