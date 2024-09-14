package Array;

import java.util.HashMap;

public class countSubarrayWithSum {

	public static void countSubArrayWithSum(int[] arr,int k) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		int currentSum=0,count=0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum=0;
			for(int j=i;j<arr.length;j++) {
				currentSum += arr[j];
				if(currentSum==k)
					count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        countSubArrayWithSum(arr, k);
	}
}
