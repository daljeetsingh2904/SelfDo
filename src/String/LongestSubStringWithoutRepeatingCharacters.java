package String;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
//		findLongest("AAABA");

		findLongestSubstring("AAAABCC");
	}

	public static void findLongest(String str) {
		boolean[] seen = new boolean[256];
		StringBuilder unique = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!seen[str.charAt(i)]) {
				unique.append(str.charAt(i));
				seen[str.charAt(i)] = true;

			}
		}
		System.out.println(unique);

	}

	public static void findLongestSubstring(String str) {
		boolean[] seen = new boolean[256];
		int left = 0, maxLength = 0;
		int start = 0;
		int right = 0;

		for (int i = 0; i < str.length(); i++) {

			while (seen[str.charAt(i)]) {
				seen[str.charAt(left)] = false; // character removed
//				System.out.println("inner left is "+left);
				left++;
			}

			seen[str.charAt(i)] = true;
//			System.out.println("i is  "+i);
//			System.out.println("lefft is "+left);
//			System.out.println("result is "+(i-left+1));

			maxLength = Math.max(maxLength, i - left + 1);
//			System.out.println("Length of longest substring is " + maxLength);
//          System.out.println("------------------");

		}

		System.out.println("Length of longest substring is " + maxLength);

	}
}
