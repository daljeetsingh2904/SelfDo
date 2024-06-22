package String;

public class countVowelsAndConsonants {

	public static void main(String[] args) {
		int[] result=countChar("daljeet");
		System.out.println(result[0]+" "+result[1]);
	}
	
	public static int[] countChar(String str) {
		 String vowels = "aeiouAEIOU";
		int countVowels=0,consonants=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				if(vowels.indexOf(str.charAt(i))!=-1) {
					countVowels++;
				}else {
					consonants++;
				}
			}
		}
		return new int[] {countVowels,consonants};
	}
}
