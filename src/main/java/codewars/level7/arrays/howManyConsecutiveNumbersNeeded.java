package codewars.level7.arrays;

import java.util.Arrays;

public class howManyConsecutiveNumbersNeeded {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4,8,6}; // 2
        int[] arr2 = new int[]{-1, -5}; //3

        System.out.println(consecutive(arr1));
        System.out.println(consecutive(arr2));
    }

    public static int consecutive(final int[] arr) {
        if (arr.length == 1 || arr.length == 0) return 0;
        Arrays.sort(arr);
        int i = arr[arr.length - 1] - arr[0];
        return i - arr.length + 1;
    }
}
