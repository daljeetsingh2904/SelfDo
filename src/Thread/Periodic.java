package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Periodic {

	public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed at: " + System.currentTimeMillis());
        
        scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.DAYS); // Start immediately, then every 5 seconds
    }
}
