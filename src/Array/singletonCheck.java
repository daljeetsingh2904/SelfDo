package Array;

import java.sql.SQLException;

public class singletonCheck {

	 public static void main(String[] args) {
	        // Attempt to get the instance of the Singleton class
	        Singleton singletonInstance1 = Singleton.getInstance();
	        Singleton singletonInstance2 = Singleton.getInstance();

	        // Print the hash codes of both instances to show they are the same
	        System.out.println("Singleton Instance 1 HashCode: " + singletonInstance1.hashCode());
	        System.out.println("Singleton Instance 2 HashCode: " + singletonInstance2.hashCode());

	        // Check if both instances are the same
	        if (singletonInstance1 == singletonInstance2) {
	            System.out.println("Both instances are the same");
	        } else {
	            System.out.println("Instances are different");
	        }
		 }
}
