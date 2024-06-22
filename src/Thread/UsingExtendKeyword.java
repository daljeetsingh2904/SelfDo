package Thread;


/**
 * Advantages of extending thread:
 * -> Directly inherit methods from thread class which can be simple for quick implementation.
 * -> Direct control over thread instance itself
 * 
 * 
 * Disadvantage of extending thread:
 * -> if we extend thread class we cant inherit another class coz multiple inheritance is not supported.
 * -> tight coupling between task and thread management code.
 */
public class UsingExtendKeyword extends Thread {

	@Override
	public void run() {
		System.out.println("started thread "+Thread.currentThread().getName());
	}
}
