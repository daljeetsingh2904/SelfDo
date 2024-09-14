package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class majorityElementArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3,3,3, 4, 5 };
		findMajority(arr);
	}

	public static void findMajority(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
			
		}
//		System.out.println(hm.values());
		boolean hasMajority=false;
		for(int key:hm.keySet()) {
		int majorityCount=arr.length/2;
	        if(hm.get(key)>majorityCount) {
	        	System.out.println("majority element is "+key);
	        	hasMajority=true;
	        	break;
	        }
		}
		if(hasMajority==false) {
			System.out.println("no majority elemt found");
		}
		
		
	}
}
