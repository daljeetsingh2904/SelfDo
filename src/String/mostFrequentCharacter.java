package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class mostFrequentCharacter {

	public static void main(String[] args) {
		frequentlyOccured("ankiiiiit");
	}

	public static void frequentlyOccured(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();

		if (str == null || str.isEmpty()) {
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
		}

		boolean isOccured = true;
		for (int count : hm.values()) {
			if (count > 1) {
				isOccured = false;
				break;
			}
		}

		if (isOccured) {
			System.out.println("No frequent charcters present !!");
			return;
		}
		int max = Collections.max(hm.values());

		for (Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == max) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}
}
