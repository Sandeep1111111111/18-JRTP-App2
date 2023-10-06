package demo;

import java.util.HashMap;
import java.util.Map;

public class StringSCP {

	public static void main(String[] args) {

		String str = "Product documentation for Nusil";

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);

			} else {

				charCountMap.put(ch, 1);

			}
		}

		System.out.println("Duplicate charater in the string :");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue() + "times ");
			}
		}

	}

}
