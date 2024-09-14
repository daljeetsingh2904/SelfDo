package Array;

import java.util.Arrays;
import java.util.HashSet;

public class pairWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int sum = -2;
//		pairUsingHash(arr, sum);
		System.out.println(hasPair(arr, sum));
	}

	public static boolean pair(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] == sum) {
				return true;
			}
		}
		return false;
	}

	// Using HashSet

	public static boolean pairUsingHash(int[] arr, int sum) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (hs.contains(temp)) {
				System.out.println("sum found");
				return true;
			}
			hs.add(arr[i]);

		}
		return false;

	}

	// Using Two pointer Algo

	static boolean hasPair(int[] arr, int sum) {
		
		if(arr.length==0 || arr.length==1) {
			return false;
		}
		int l=0, r=arr.length-1;
		Arrays.sort(arr);
         while(l<r) {
        	 if(arr[l]+arr[r]==sum) {
        		 return true;
        	 }else if(arr[l]+arr[r]<sum) {
        		 l++;
        	 }else {
        		 r--;
        	 }
        	
         }
         return false;
	}

}
