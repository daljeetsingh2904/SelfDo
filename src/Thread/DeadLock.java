package Thread;

/**
 * 
 * Deadlock in java occurs when two or more threads are waiting indefinietly for each other to release resources,
 * causing the threads to be blocked forever.This occures when the threads acquire multiple locks in different orders.
 *
 */

public class DeadLock {
	
	private final Object resource1=new Object();
	private final Object resource2=new Object();
	
	public static void main(String[] args) {
		DeadLock obj=new DeadLock();
		obj.start();
	}

	
	private void start() {
		Thread t1=new Thread(()-> {
			synchronized (resource1) {
				System.out.println("Thread 1: Locked resource 1");
				try {
				  Thread.sleep(100);	
				}catch(InterruptedException e) {
					System.out.println();
				}
				
				synchronized (resource1) {
					System.out.println("Thread 1: Locked resource 1");
			}
		}
	});
	t1.start();
	System.out.println("hi");
}
}
