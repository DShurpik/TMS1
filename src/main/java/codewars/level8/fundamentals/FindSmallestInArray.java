package codewars.level8.fundamentals;

import java.util.Arrays;

public class FindSmallestInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{78,56,232,12,11,43};

        System.out.println(findSmallestInt(arr));
        System.out.println(findSmallestInt1(arr));
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i : args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findSmallestInt1(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
