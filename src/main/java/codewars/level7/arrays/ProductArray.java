package codewars.level7.arrays;

import java.util.Arrays;

public class ProductArray {
    public static long[] productArray(int[] numbers) {
        long[] result = new long[numbers.length];
        long temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    temp = temp * numbers[j];
                }
                result[i] = temp;
                }
            temp = 1;
            }
        return result;
        }


    public static void main(String[] args) {
        long[] result = productArray(new int[]{3,27,4,2});
        System.out.println(Arrays.toString(result)); // 216,24,162,324
    }
}
