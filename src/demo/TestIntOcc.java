package demo;

import java.util.HashMap;
import java.util.Map;

public class TestIntOcc {

	public static void main(String[] args) {

		int[] array = {1,2,3,2,3,4};
		
		HashMap<Integer,Integer>maped = new HashMap<>();
		
		for (int num : array) {
			maped.put(num,maped.getOrDefault(num, 0)+1);
			
			
			System.out.println("Integer Occurence number is");
			
			for(Map.Entry<Integer, Integer>entry:maped.entrySet()) {
				System.out.println(entry.getKey()+" :"+entry.getValue());
			}
		}
		
	}

}
