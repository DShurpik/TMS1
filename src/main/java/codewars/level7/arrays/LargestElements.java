package codewars.level7.arrays;

import java.util.Arrays;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        if (n == 0) {
            return new int[]{};
        }
        int[] result = new int[n];
        int index = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            result[index] = arr[i];
            index++;
            if (index == n) break;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = largest(5, new int[]{85, 36, 39, 74, 52});
        System.out.println(Arrays.toString(arr));
    }
}
