package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * continue statement is used to break one iteration,if specified condtion
 * occurs and continues with next iteration in loop . It can be used with for
 * loop or while loop
 *
 * AND
 * 
 * break is used to jump out of loop. or terminate the loop
 * 
 */
public class frequencyElementInArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
		freqElement(arr,arr.length);
	}

	public static void freqElement(int[] arr) {
		boolean visited[] = new boolean[arr.length];
		Arrays.fill(visited, false);

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + "  " + count);

		}
	}

	public static void freqElement(int[] arr, int length) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i]) + 1);
			} else {
                hs.put(arr[i], 1);
			}
		}
//		System.out.println(hs.toString());
		
		for(Map.Entry<Integer, Integer> entry:hs.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
