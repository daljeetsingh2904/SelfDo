package Array;

public class arrIsPalindromeOrNot {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1};
		System.out.println(checkPalindrome(arr));
	}
	
	public static boolean checkPalindrome(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			if(arr[start]==arr[end])
				return true;
			
			start++;
			end--;
		}
		return false;
	}
}
