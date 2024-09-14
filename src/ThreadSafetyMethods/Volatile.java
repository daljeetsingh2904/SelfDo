package ThreadSafetyMethods;
/*
Volatile : is field variable that ensures the object can be used multiple threads at same time without having any problem .
                means two object will give accurate problem simultaneosuly without any inconsistent data
*/  
public class Volatile {

	static volatile int a=0,b=0;
	
	static void firstMethod() {
		a++;
		b++;
	}
	
	static void secondMethod() {
		 System.out.println(
		            "a=" + a + " b=" + b);
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				 for (int i = 0; i < 5; i++)
					 firstMethod();
				 
			}
		};
		
		
		
			Thread t2=new Thread() {
				public void run() {
					 for (int i = 0; i < 5; i++)
						 secondMethod();
					 
				}
			};
			
			t1.start();
			t2.start();
		
	}
}
