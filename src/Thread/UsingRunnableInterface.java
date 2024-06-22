package Thread;

public class UsingRunnableInterface implements Runnable {

	/**
	 * The runnable interface defines a single method i.e run() meant to contain the code to execute,the runnable object is passed to thread constructor
	 * Runnable:
	 * -> it is functional interface which means it has single abstract method.
	 * ->the start method of thread class is then called to begin execution of run() in new thread
	 */
	@Override
	public void run() {
		System.out.println("Active count is --> "+Thread.activeCount());
		
	}
	
	public static void main(String[] args) {
		UsingRunnableInterface obj=new UsingRunnableInterface();
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("id is "+thread.getId()+" name is "+thread.getName()+" priority is --->>> "+thread.getPriority()
		                             );
		
		
		/**
		 * Using Lambda expression:
		 */
		 
		Runnable runnable=()->{
			System.out.println("Thread is running");
		};
		
	   Thread thread1=new Thread(runnable);
		thread1.start();
	}

	
}
