package Thread;
/**
 * 
 * Synchronization : is the process of allowing one thread at a time , to complete the particular task.
	 *                       It means when multiple thread executing simultaneously the same resource at a time 
	 *                       then problem of inconsistency will occur.
	 *                       So synchronized is used to remove inconsistency problem by allowing one thread at a time.
	 *                       We can make synchronized method or make a synchronnized block.
 *
 */
public class threadSafeSynchronized {

	public static void main(String[] args) {
		
		sync obj1=new sync();
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj1);
			t1.setName("First Thread");
			t2.setName("Second Thread");
			t1.start();
			t2.start();
	}
	
	
	synchronized void sum(int n) {
		Thread t =	Thread.currentThread();
		for(int i=1;i<5;i++) {
			System.out.println(t.getName()+" : "+(n+i));
		}
	}
	
	
	
}


class sync extends Thread{
	threadSafeSynchronized obj=new threadSafeSynchronized();
	public void run() {
		obj.sum(10);
	}
}