package ThreadSafetyMethods;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {

	
	AtomicInteger count=new AtomicInteger();
	 public void increment()
	    {
	        count.incrementAndGet();
	    }
	 
	 public static void main(String[] args) {
		 AtomicVariable obj=new AtomicVariable();
		 Thread t1=new Thread() {
				public void run() {
					 for (int i = 0; i < 5; i++)
						 obj.increment();
					 
				}
			};
			
			
			
				Thread t2=new Thread() {
					public void run() {
						 for (int i = 0; i < 5; i++)
							 obj.increment();
						 
					}
				};
				
				t1.start();
				t2.start();
				
				try {
					t1.join();
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println(obj.count);
			
	}
}
