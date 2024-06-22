package String;

public class Rotation {

	public static void main(String[] args) {
		String str1="ABCD",str2="CDAB";
		System.out.println(isRotated(str1, str2));
		
	}
	
	public static boolean isRotated(String str1,String str2) {
		
		
		return ((str1+str1).indexOf(str2)!=-1);
		
		
	}
}
