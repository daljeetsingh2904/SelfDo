package Array;

import java.util.Arrays;

public class mergeTwoArray {

	public static void main(String[] args) {
		 int[] arr1 = {1, 3, 5, 7};
	        int[] arr2 = {2, 4, 6, 8};
	        mergeArrayOptimize(arr1, arr2);
	}
	
	public static void mergeArray(int[] arr1,int[] arr2) {
		int[] resultArray=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			resultArray[index++]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			resultArray[index++]=arr2[i];
		}
		
		System.out.println("Merged array is "+Arrays.toString(resultArray));
			
	}
	
	public static void mergeArrayOptimize(int[] arr1,int[] arr2) {
			int[] resultArray=new int[arr1.length+arr2.length];
			System.arraycopy(arr1, 0, resultArray, 0, arr1.length);
			System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);
			
			System.out.println("merged array is "+Arrays.toString(resultArray));
	}
}
