package String;

public class longestCommonPrefix {

	public static void main(String[] args) {
		String[] input={"apple", "ape", "april"};
		System.out.println(longestPrefix(input));
		
	}
	
	public static String longestPrefix(String[] str) {
		if(str.length==0) 
			return "";
		
		if(str.length==1) 
		return str[0];	
		
		String prefix=str[0];
		
		for(int i=0;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
}
