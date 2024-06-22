package String;

public class reverse {

	public static void main(String[] args) {
		String str="daljeet";
		System.out.println(reverseUsingStringBuilder(str));
	}
	
	public static String reverse(String str) {
		String reverse="";
		if(str==null || str.isEmpty()) {
			return "String is empty";
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
	public static String reverseUsingStringBuilder(String str) {
		String reverse="";
		if(str==null || str.isEmpty()) {
			return "String is empty";
		}
		
		StringBuilder strbuild=new StringBuilder(str);
		strbuild.reverse();
		return strbuild.toString();
		
		
	}
}
