package Array;

import java.util.HashMap;

public class findDuplicate {

	public static void main(String[] args) {
		int[] arr={1, 2, 3, 6, 3, 6, 1};
		duplicateCheck(arr);
	}
	
	public static void duplicateCheck(int[] arr) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
		}else {
			hm.put(arr[i], 1);
		}
		
		}
		System.out.println(hm);
		for(int key:hm.keySet()) {
			if(hm.get(key)>1)
			System.out.println("duplicate values are "+key+",");
		}
	}
}
