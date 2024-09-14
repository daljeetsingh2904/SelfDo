package String;

import java.util.Stack;

public class palindromeSentence {

	public static void main(String[] args) {
		String str = "Too hot to hoot.";
		System.out.println(palindromeCheck(str));
	}

	public static boolean palindromeCheck(String str) {
		Stack<Character> st = new Stack<>();
		String reverse="";
		String cleanStr="";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetterOrDigit(str.charAt(i))) {
				cleanStr+=Character.toLowerCase(str.charAt(i));
				st.push(Character.toLowerCase(str.charAt(i)));
			}
			
		   while(!st.isEmpty()) {
			   reverse+=st.pop();
		   }
		
		}
		System.out.println("str is "+cleanStr);
		System.out.println("reverse is "+reverse);
		
		return cleanStr.equals(reverse);
		
	}
}
