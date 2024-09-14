package String;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "liste";
		System.out.println(checkAnagram(str1, str2));

	}

	public static boolean checkAnagram(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (ch1.length != ch2.length) {
			return false;
		}

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch2[i]) {
				return true;
			}
		}
		return false;

	}
}
