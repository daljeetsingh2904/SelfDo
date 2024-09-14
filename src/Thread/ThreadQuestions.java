package Thread;

public class ThreadQuestions {

	/**
	 * 1. What is thread?
	 *         Thread is lightweight subprocess , the samllest processing in JVM.
	 *         
	 * 2. What is multithreading ?
	 *          Multi threading is process of executing multiple threads to maximize CPU utilization.
	 *        
	 * 3. Diff b/w process and thread ?
	 *         Process are independent and have their own memory space ,whereas the thread share the same memory space 
	 *          within process.
	 *          
	 *  4. Advantage of multithreading ?
	 *          Improve application perfomance , maximize CPU utilization . and enhanced by keeping UI responsive .
	 *          
	 *  5. how to create thread in java ? 
	 *            By extending thread class or implemeting runnable interface.
	 *            
	 *  6. Different cycle of thread ?
	 *             New , Runnable,Blocked,Waiting,Timed Waiting,Terminated 
	 *            
	 *  7. Explain thread life cycle ?
	 *             A thread starts in new state, moves to runnable when start() is called , and runs in running state.
	 *             It can enter blocked/waiting state during synchronization or waiting for resource and eventually 
	 *             reaches the terminated state once execution is completed.
	 *             
	 *  8. what is synchronization ?
	 *              is mechanism to control access to shared resource to prevent data inconsistency.
	 *              
	 *  9. how to synchronized method in java ?
	 *              public synchronized void add(int a,int b){
	 *              }
	 *              
	 *  10. what is synchronized block ?
	 *          public void add(int a ,int b){
	 *          synchronized(this){
	 *          }            
	 *          }
	 *          
	 *   11.what are deadlock and how to prevent?
	 *           is a situtation where two or more thread blocked forever,waiting for each other . It can be prevented by
	 *           avoiding nested locks , acquiring locks in fixed order .
	 *           
	 *   12. how to threads communicate thread ?
	 *           wait(),notify(),notifyAll()
	 *          
	 *   13. use of wait , notify , notifyAll?
	 *           synchronized (sharedObject) {
                     while (condition) {
                       sharedObject.wait();
                      }
                       sharedObject.notify();
                      } 
	 *   
	 *    14. what is volatile ?
	 *          is used to mark a variable as being stored in main memory.Every read of	volatile 
	 *          variable will be read from computer main memory, and not from CPU cache.
	 *          
	 *    15. join() method in java ?
	 *          allows one thread to wait for completion of another.
	 *          
	 *    16. Daemon thread?
	 *          daemon thread are low priority threads that run in background and provide service to user threads.
	 *          They do not prevent the JVM from exiting all user threads have finished.                           
	 *                  
	 *    17. Thread pool and how to implement in java ?
	 *            is pool of worker threads that are reused to execute multiple task.
	 *            it is implemented using executor service.
	 *            
	 *    18. Example of executor service?
	 *           ExecutorService executor=Executors.newFixedThreadPool(10);
	 *             for(int i=0;i<10;i++){
	 *             executor.submit(new Task());
	 *             }
	 *             executor.submit();
	 *             
	 *     19. Common problems in multithreading?
	 *            deadlock,race condition,thread starvation,resource contention
	 *            
	 *     20. Best practice for multithreading programming?
	 *             Keep synchronzied block, minimize scope of locks,prefer higher level concurrency utilities over
	 *             low level synchronization,use immutable objects,and throughly test code.
	 *             
	 *     21.What are some of the concurrency utilities provided by Java?
	 *               CountDownLatch, CyclicBarrier, Semaphore, Lock, ReentrantLock, ReadWriteLock, etc.
	 *               
	 *     22. Can you explain how CountDownLatch works with an example?
                      CountDownLatch latch = new CountDownLatch(3);
							for (int i = 0; i < 3; i++) {
							    new Thread(() -> {
							        // Perform some work
							        latch.countDown();
							    }).start();
							}
							latch.await();
							System.out.println("All threads have finished");
                                       
	 *                  
	 *      23. how to prevent thread starvation ?
	 *             by ensuring fair access to resources,using proper synchronization techniques,and avoiding 
	 *             hold locks for long period.
	 *             
	 *      24. What is the Fork/Join framework and when would you use it?
                    The Fork/Join framework is used for parallel processing by breaking a task into smaller subtasks.
                    = It is useful for tasks that can be divided into independent subtasks.
       
	 * 
	 */
}
