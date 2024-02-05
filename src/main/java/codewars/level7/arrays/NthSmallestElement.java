package codewars.level7.arrays;
// https://www.codewars.com/kata/5a512f6a80eba857280000fc/train/java
public class NthSmallestElement {
    public static void main(String[] args) {
        System.out.println(nthSmallest(new int[]{15, 20, 7, 10, 4, 3}, 3)); // 7
        System.out.println(nthSmallest(new int[]{177, 225, 243, -169, -12, -5, 2, 92}, 5)); // 92
    }

    public static int nthSmallest(final int[] arr, final int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[n - 1];
    }
}
