package Array;

public class LargestSmallestArray {

	public static void main(String[] args) {
		int[] arr= {8,2,3,7,5,6,9};
//		findLargestSmallest(arr);
		findlargeSmall(arr);
	}
	
	public static void findLargestSmallest(int[] arr) {
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("max is "+max+" and min is "+min);
	}
	
	
	public static void findlargeSmall(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		
		for(int i=0;i<min;i++) {
			min=Math.min(min, arr[i]);
		}
		
		System.out.println("max is "+max+" and min is "+min);
		
	}
}
