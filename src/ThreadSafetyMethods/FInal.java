package ThreadSafetyMethods;

/**
 * 
 * Final variable are also thread safe because when assigned value to final variable it cannot be chnaged.
 * It can point any other refernece.
 */
public class FInal {

	final String str=new String("Daljeet");
	public static void main(String[] args) {
		
	}
	
	void change()	{
//		str="hello dj";   // The final field FInal.str cannot be assigned
	}
	
}
