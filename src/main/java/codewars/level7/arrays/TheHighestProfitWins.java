package codewars.level7.arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

// https://www.codewars.com/kata/559590633066759614000063/train/java
public class TheHighestProfitWins {
    public static void main(String[] args) {
        assertArrayEquals(new int[]{1,5}, minMax(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5, 2334454}, minMax(new int[]{2334454,5}));
        assertArrayEquals(new int[]{1, 1}, minMax(new int[]{1}));
    }

    public static int[] minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }
}
