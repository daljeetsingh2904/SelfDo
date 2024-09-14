package Array;

public class maxSubArraySum {

	public static void main(String[] args) {
		  int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		  System.out.println(maxSubArray(a));
	}

	public static int maxSubArray(int[] arr) {
		int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

		for (int i = 0; i < arr.length; i++) {
			maxEndingHere += arr[i];

			maxSoFar = Math.max(maxSoFar, maxEndingHere);

			maxEndingHere = Math.max(maxEndingHere, 0);

		}
		return maxSoFar;

	}
}
