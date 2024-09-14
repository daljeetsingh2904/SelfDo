package Array;

import java.util.HashSet;

public class pairWithSum {

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		int sum = -4;
		System.out.println(checkSum(arr, sum));
		System.out.println(checkSumUsingHashSet(arr, sum));
	}

	public static boolean checkSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkSumUsingHashSet(int[] arr, int sum) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(sum - arr[i])) {
				return true;
			}

			hs.add(arr[i]);
		}
		return false;
	}
}
