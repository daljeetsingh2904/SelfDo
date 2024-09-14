package Array;

public class searchElementInSorted2dMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
		
		
		int result=search(arr, 29);
		 if (result == 1) {
		        System.out.println("Element found.");
		    } else if (result == 0) {
		        System.out.println("Element not found.");
		    } else {
		        System.out.println("Array is empty.");
		    }

	}
	
	public static int search(int[][] arr,int toSearch) {
		if(arr.length<1) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==toSearch) 
				return 1;
				System.out.println();
			}
		}
		return 0;
	}
}
