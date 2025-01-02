package codewars.level7.arrays;

import java.util.Arrays;

public class TwoOldestAges {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoOldestAges(new int[]{1,5,87,45,8,8}))); // [45, 87]
    }

    public static int[] twoOldestAges(int[] ages) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : ages) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return new int[]{max2, max1};
    }
}
