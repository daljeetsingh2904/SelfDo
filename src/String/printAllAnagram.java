package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class printAllAnagram {

	public static void main(String[] args) {
		 String[] words = {"listen", "silent", "enlist", "rat", "tar", "god", "dog", "evil", "vile", "veil"};
	        printAllAnagrams(words);
	}
	
	public static void printAllAnagrams(String[] words) {
		Map<String,List<String>> hs=new HashMap<>();
		
		for(String word:words) {
		   char[] ch=word.toCharArray();
		   Arrays.sort(ch);
		   String sortedStr=new String(ch);
		   
		   hs.putIfAbsent(sortedStr, new ArrayList<>());
		   
		   
		   hs.get(sortedStr).add(word);
		}
		
		for(List<String> anagramGrouping:hs.values()) {
			if(anagramGrouping.size()>1) {
				System.out.println(anagramGrouping);
			}
		}
	}
}
