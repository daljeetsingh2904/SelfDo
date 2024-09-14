package Array;

import java.util.Arrays;

public class RotateArrayByKTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		int k = 3;
		rotateArray(arr, k);
		System.out.println(Arrays.toString(arr));

	}

	public static void rotate(int[] arr, int k) {
		if (k < 0)
			return;
		k = k % arr.length;

		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			temp[(i + k) % arr.length] = arr[i];
		}
		System.arraycopy(temp, 0, arr, 0, arr.length);
	}

	/**
	 * USing Reverse in Place
	 */

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotateArray(int[] arr, int k) {
		if(k<0) {
			return;
		}
		
		int n = arr.length;
		k = k % n; // this we are doing to get remainder value
		
		reverseArray(arr, 0, n-1);      // Reverse the entire array
		
		reverseArray(arr, 0, k-1);      // Reverse the first k values
//		
		reverseArray(arr, k, n-1);       // reverse the remaining n-k elements 
		
		

	}
}
