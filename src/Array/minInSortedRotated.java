package Array;

public class minInSortedRotated {

	public static int findMin(int[] nums) {
	      int min=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<min){
	                min=nums[i];
	            }
	        }
	        return min;
	    }
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(findMin(arr));
	}
}
