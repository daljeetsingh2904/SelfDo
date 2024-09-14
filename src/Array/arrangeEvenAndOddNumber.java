package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class arrangeEvenAndOddNumber {

	public static void main(String[] args) {
		int[] arr={12, 34, 45, 9, 8, 90, 3};
		rearrangeNumber(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
		}
	}
	
	public static void rearrangeNumber(int[] arr) {
	   int left=0;
	   int right=arr.length-1;
	   while(left<right) {
		   while(arr[left]%2==0 && left<right) 
			   left++;
		   while(arr[right]%2==1 && left<right)
			   right--;
		   
		   if (left < right)
           {
               /* Swap arr[left] and arr[right]*/
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
	   }
	}
}
