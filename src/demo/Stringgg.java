package demo;

import java.util.HashMap;

public class Stringgg {

	public static void main(String[] args) {
		
		String str = "aabbbbbbbrrrrrrrroooooo";
		
		HashMap<Character, Integer>map= new HashMap<>();
		
		for (int i = 0;i<str.length();i++) {
			Character ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Character key : map.keySet()) {
			System.out.println(key+""+map.get(key));
		}

	}
	

}
