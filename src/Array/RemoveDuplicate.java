package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		int n=removeDuplicate(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int removeDuplicate(int[] arr) {
		int j = 0;
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) 
			if (arr[i] != arr[i + 1]) 
				  arr[j++] = arr[i];
			
		arr[j++] = arr[arr.length-1];
		return j;
	}

	public static int removeDuplicate(int[] arr, int length) {
		
		if(length==0 || length==1) {
			return length;
		}
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		int i=0;
         for(int element:hs) {
        	 arr[i++]=element;
         }
         return hs.size();
	}
}
