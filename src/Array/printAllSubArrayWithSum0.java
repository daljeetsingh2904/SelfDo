package Array;

import java.util.HashSet;

public class printAllSubArrayWithSum0 {

	public static void main(String[] args) {
		 int[] arr = {4, 2, 0, 1, 6};
	        if (hasSum0(arr)) {
	            System.out.println("Array contains a subarray with sum 0.");
	        } else {
	            System.out.println("Array does not contain a subarray with sum 0.");
	        }
	}
	
	public static boolean hasSum0(int[] arr) {
		HashSet<Integer> hs=new HashSet<>();
		int cumulativeSum=0;
		
		for(int num:arr) {
			cumulativeSum+=num;
			
			if(cumulativeSum==0 || hs.contains(num)) {
					return true;
			}
			hs.add(cumulativeSum);
		}
		return false;
	}
}
