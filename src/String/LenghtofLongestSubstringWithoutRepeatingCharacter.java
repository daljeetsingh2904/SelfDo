package String;

import java.util.HashMap;
import java.util.HashSet;

public class LenghtofLongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubString("pwwkew"));
	}

	// Not correct way , will not pass all use cases
	public static int longestSubString(String str) {
		HashSet<Character> hs = new HashSet<>();

		if (str == null || str.isEmpty()) {
			return 0;
		}

		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		System.out.println(hs.toString());
		return hs.size();
	}

	public static boolean isUnique(String str, int start, int end) {
		HashSet<Character> hs = new HashSet<>();
		for (int i = start; i <= end; i++) {
			if (hs.contains(str.charAt(i))) {
				return false;
			}
			hs.add(str.charAt(i));
		}
		return true;
	}

	public static int lengthOfLongestSubString(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (isUnique(str, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}

	/**
	 * suppose i have string=pwwkew i=0 , check for p substring p unique res=1 pw
	 * res=2 pww not unique
	 * 
	 * i=1 w res=1 ww duplicate
	 * 
	 * 
	 * i=2
	 * 
	 * w res=1 wk res=2 wke res=3
	 * 
	 * i=3 k res=1 ke res=2 kew res=3
	 * 
	 * 
	 */

	/// USING SLIDING WINDOW

	public int lenghtofLongestSubstring(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int maxLength = 0;
		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				start = Math.max(start, hm.get(s.charAt(i)) + 1);
			}

			hm.put(s.charAt(i), i);

			maxLength = Math.max(maxLength, i - start + 1);
		}
		return maxLength;
	}
}
