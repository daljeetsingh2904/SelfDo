package String;

import java.util.HashMap;
import java.util.Map;

public class maxRepeatingCharacter {

	public static void main(String[] args) {
		String str="Daljeet";
		maxRepeat(str);
	}
	
	public static void maxRepeat(String str) {
		
		HashMap<Character, Integer> hs=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println(hs);
		
		int max=0;
		Character maxRepeatIs=null;
		for(Map.Entry<Character, Integer> hm :hs.entrySet()) {
			if(hm.getValue()>max) {
				max=hm.getValue();
				maxRepeatIs=hm.getKey();
				
			}
		}
		System.out.println("max is "+max+"and key is "+maxRepeatIs);
	}
	
	
}
