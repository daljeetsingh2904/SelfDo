package Array;

import java.util.Arrays;

public class moveAllZerosToEndOfArray {

	public static void main(String[] args) {
		int[] arr = { 0,1, 2, 3, 4, 5, 0, 0, 6, 7, 0, 0, 8 };
		moveZero(arr);

		// moveZerosToEnd(arr);
	}

	public static void moveZero(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
			
		}
		
		 while (index < arr.length) {
	            arr[index++] = 0;
	        }
		 
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr));
	}

	public static void moveZerosToEnd(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, j, i);
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
