package Array;

public class numberOfSubArrayHavingSumK {

	public static void subArray(int[] arr,int k) {
		int count=0,sum;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==k)
					count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        subArray(arr, k);
	}
}
