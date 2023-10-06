package Practice;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		
		
		int [] a = {1,2,4,5,1,4,6,5};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j = i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
	}
}
