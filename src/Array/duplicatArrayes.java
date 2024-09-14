package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class duplicatArrayes {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 5, 3, 2 };
		List<Integer> ll = findDupliate(arr);

		if (ll.isEmpty()) {
			System.out.println("no duplicate found");
		} else {
			System.out.println(ll);
		}
	}

	public static List<Integer> findDupliate(int[] arr) {
		List<Integer> ll = new ArrayList<>();
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				ll.add(entry.getKey());
			}
		}
		Collections.sort(ll);
		return ll;
	}

}
