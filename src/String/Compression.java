package String;

public class Compression {

	/**
	 * Example 1 : Input: "aabcccccaaa" Output:a2bc5a2
	 * 
	 * Example 2 : Input:"abcdef" output:abcdef
	 * 
	 * Example 3 : Input: "aabbcc" Output:"aabbcc" since the compressed string will
	 * be equal in lenght
	 * 
	 * Exampe 4 : Input "" Output : ""
	 * 
	 * Example 5 : Input"" Output: ""
	 * 
	 * Exmaple 6 : Input : null Output:null
	 * 
	 */

	public static void main(String[] args) {
            System.out.println(compressedForm("aabcccccaaa"));
	}

	public static String compressedForm(String str) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		if (str.isEmpty() || str == null)
			return str;

		for (int i = 0; i <str.length(); i++) {
//			System.out.println("count ye ha "+i+"for -->> "+count);
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
//				System.out.println("count is "+count);
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		return sb.length() < str.length() ? sb.toString() : str;
	}
}
