package String;

public class IntegerToString {

	public static void main(String[] args) {
		int i=1;
		intToString(i);
	}
	
	public static void intToString(int i) {
		String res=Integer.toString(i);
		System.out.println(res);
	}
}
