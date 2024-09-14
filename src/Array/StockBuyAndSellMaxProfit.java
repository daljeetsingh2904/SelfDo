package Array;

public class StockBuyAndSellMaxProfit {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 1, 3, 6, 9, 11 };
		System.out.println(maxProfit(arr));
	}

	/**
	 * In this time complexity is O(n^2)
	 * 
	 */
	public static int maxProfit(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				res = Math.max(res, arr[j] - arr[i]);
			}
		}
		return res;
	}

	/**
	 * In this time complexity is O(n)
	 */

	public static int maxProfitWithOneLoop(int[] arr) {
		int res = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
             min=Math.min(min, arr[i]);
             
             res=Math.max(res, arr[i]-min);
		}
		return res;
	}
}
