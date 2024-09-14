package Array;

public class minElementSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr={5, 6, 1, 2, 3, 4};
		findMin(arr);
	}
	
	public static void findMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				System.out.println(min);
			}
		}
	}
}
