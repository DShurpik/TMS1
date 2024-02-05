package codewars.level7.arrays;

import java.util.Arrays;

public class MaxMinArrays {
    public static void main(String[] args) {
        int[] arr = solve(new int[]{15,11,10,7,12});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solve (int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
        }
        return result;
    }
}
