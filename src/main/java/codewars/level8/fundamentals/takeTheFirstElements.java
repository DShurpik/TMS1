package codewars.level8.fundamentals;

import java.util.Arrays;

public class takeTheFirstElements {

    public static void main(String[] args) {
        int[] arr = take(new int[]{0, 1, 2, 3, 5, 8, 13}, 7);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] take1(int[] arr, int n) {
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }

    public static int[] take(int[] arr, int n) {
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
