package String;

public class removeSpecificCharacter {

	public static void main(String[] args) {
		System.out.println(removeSpecific("Ankit".toLowerCase(), "abc".toLowerCase()));
	}
	
	public static String removeSpecific(String str,String toRemove) {
		if(str.isEmpty() || str==null || toRemove.isEmpty() || toRemove==null) 
			return "";
			
		StringBuilder sb=new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			if(toRemove.indexOf(ch)==-1) {               
				sb.append(ch);                      // append if it is not present in toRemove
			}
		}
		return sb.toString();
	}
}
