package Array;

import java.util.HashMap;

public class lengthOfLongestSubArray {

	public static void main(String[] args) {
		 int[] arr = {1, -1, 5, -2, 3};
	        int targetSum = 3;

	        System.out.println("Length of the longest subarray with sum " + targetSum + ": " + longestSubArray(arr, targetSum));

	}

	public static int longestSubArray(int[] arr, int targetSum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int maxLen = 0;
		int currSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];

			if (currSum == targetSum) {
				maxLen = i + 1;
			}

			if (hm.containsKey(currSum - targetSum)) {
				maxLen = Math.max(maxLen, i - hm.get(currSum - targetSum));
			}

			if (!hm.containsKey(currSum)) {
				hm.put(currSum, i);
			}
		}
		return maxLen;
	}

}
