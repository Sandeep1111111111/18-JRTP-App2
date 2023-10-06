package demo;

public class NoPairWithValue100 {
    public static void main(String[] args) {
        int[] arr = {10,30,70,50,80,20,21,40,60,79};
        findNoPairWithValue100(arr);
    }

    public static void findNoPairWithValue100(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            boolean hasPair = false;
            
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == 100 - value) {
                    hasPair = true;
                    break;
                }
            }
            
            if (!hasPair) {
                System.out.println("Value with no pair that equals 100: " + value);
            }
        }
    }
}
