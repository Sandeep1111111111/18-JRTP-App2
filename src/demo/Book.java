package demo;

public class Book {
	
	
	public static void main(String[] args) {
		
		String inputString ="sandeep shirsath";

		int[] charCount = new int[128];

		for(char c : inputString.toCharArray()){
		charCount[c]++;
		}

		for(int i=0;i<charCount.length;i++){

		if(charCount[i]>0){

		System.out.println(" , " + (char) i + " " + charCount[i]);

		}
		}
	
		
		
		
		
		
		
		
		
		}
		
}
