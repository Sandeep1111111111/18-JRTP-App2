package Practice;

public class RemoveDuplicateNumberArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 5, 6, 5, 6, 1, 1 };

		for (int i=0;i<arr.length;i++) {

			for (int j=i+1; j<arr.length;j++) {

				if (arr[i]==arr[j]) {
					arr[i]=-1;
				}
			}

		}

		System.out.println("Remove array is");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=-1) {

			

			System.out.println(arr[i]);
		}

	}
	}
}
