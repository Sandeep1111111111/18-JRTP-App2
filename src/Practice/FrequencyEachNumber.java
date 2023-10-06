package Practice;

import java.util.HashMap;

import java.util.Map;

public class FrequencyEachNumber {

	public static void main(String[] args) {

		int[] numbers = { 3, 2, 5, 6, 7, 4, 5, 6, 7 };

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : numbers) {
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);

			} else {
				frequencyMap.put(num, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Number  " + entry.getKey() + "  appears  " + entry.getValue() + "  time");

		}

	}

}
