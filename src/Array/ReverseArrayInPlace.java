package Array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayInPlace {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
//		reverseArray(arr,0,4);
//		printArray(arr);
		
		reverseArr(arr);
	}
	
	public static void reverse(int[] arr) {
		int[] reverseArray=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			reverseArray[i]=arr[arr.length-i-1];
		}
		
		System.out.println("Reversed array is "+Arrays.toString(reverseArray));
		
//		for(int i:reverseArray) {
//			System.out.print(i+" ");
//		}
		
		
	}
	
	
	static void reverseArray(int[] arr ,int start,int end) {
		int temp;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		
	}
	
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	
	/**
	 * 
	 * USING STACK 
	 * 
	 */
	
	public static void reverseArr(int[] arr) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
		}
		
		System.out.println("Array is "+Arrays.toString(arr));
	}
	
	

}
