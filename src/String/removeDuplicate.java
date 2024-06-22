package String;

import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		String str="daljeet";
		System.out.println(duplicate(str));
	}
	
	public static String duplicate(String str) {
		HashSet<Character> hs=new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		
		return hs.toString();
	}
}
