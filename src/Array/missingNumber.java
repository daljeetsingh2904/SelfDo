package Array;

public class missingNumber {

	public static void main(String[] args) {
		 int[] arr = { 1, 2, 3, 5 };
		 findMissing(arr, 5);
		 
	}
	
	public static void findMissing(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n-1;i++) {
			sum+=arr[i];
		}
		
		int expectedSum=(n*(n+1))/2;
		System.out.println(expectedSum-sum);
	}
}
