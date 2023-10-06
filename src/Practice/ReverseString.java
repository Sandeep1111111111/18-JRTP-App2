package Practice;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Sandeep";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}

}
