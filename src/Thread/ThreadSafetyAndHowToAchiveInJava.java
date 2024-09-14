package Thread;

public class ThreadSafetyAndHowToAchiveInJava {

	/**
	 * 	-> Multithreading is process of running multiple threads simultaneously . When multiple threads are working on same data 
	 *  and the value of our data is changing , that scenario is not thread safe and we get inconsistent result.
	 *  
	 *  -> When a thread is already working on object and preventing another thread working on same object , this process is called 
	 *  thread safety.
	 *  
	 *  -> How to achieve thread safety ?
	 *   1.Synchronization : is the process of allowing one thread at a time , to complete the particular task.
	 *                       It means when multiple thread executing simultaneously the same resource at a time 
	 *                       then problem of inconsistency will occur.
	 *                       So synchronized is used to remove inconsistency problem by allowing one thread at a time.
	 *                       We can make synchronized method or make a synchronnized block.
	 *                       
	 *   2.Volatile : is field variable that ensures the object can be used multiple threads at same time without having any problem .
	 *                   means two object will give accurate problem simultaneosuly without any inconsistent data.
	 *                   
	 *   3.                                 
	 *   
	 */
}
