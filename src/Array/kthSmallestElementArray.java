package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthSmallestElementArray {

	public static void main(String[] args) {
		 int arr[] = { 12, 3, 5, 7, 19 };
	        int K = 3	;
		System.out.println(findKSmall(arr, K));
	}
	
	public static int findKSmall(int[] arr,int k) {
           Arrays.sort(arr);
           return arr[k-1];
	}
	
	
	/**
	 * Using Priority Queue
	 */
	
	public static int kSmall(int[] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<arr.length;i++) {
			pq.offer(arr[i]);           // push element on max heap
		
			if(pq.size()>k)
				pq.poll();
		
		}
		return pq.peek();
		
		
	}
	
	
}
