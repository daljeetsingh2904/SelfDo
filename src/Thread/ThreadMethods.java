package Thread;

/**
 * Thread Methods:
 * 
 * -> start() - Begins the execution of thread.
 * -> run()   - Contains the code to be executed in thread.
 * -> sleep() - Causes the current thread to sleep for specified time.
 * -> join()  - Waiting for thread to die.
 * -> interrupt()- interrupt the thread.
 * -> isAlive()  -checks if thread is alive	
 */


public class ThreadMethods implements Runnable{

	public static void main(String[] args) {
		ThreadMethods obj=new ThreadMethods();
		Thread t=new Thread(obj);
		t.start();
		Thread t1=new Thread(obj);
		t1.start();
		
		
		System.out.println("Thread "+t.isAlive());
	}

	@Override
	public void run() {	
		for(int i=0;i<5;i++) {
			 if (Thread.currentThread().isInterrupted()) {
                 System.out.println("Thread was interrupted. Exiting...");
                 break;
             }
			 
			
		System.out.println("Thread started with name -->> "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
