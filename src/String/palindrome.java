package String;

public class palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("daljeet"));
	}
	
	public static boolean isPalindrome(String str) {
		if(str==null || str.isEmpty()) {
			return false;
		}
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		if(str.equals(rev)) {
			return true;
		}
		return false;
	}
}
