package codewars.level7.arrays;

import java.util.Arrays;

public class NiceArray {
    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3})); // true
        System.out.println(isNice1(new int[]{3, 4, 5, 7})); // false
    }

    public static boolean isNice(int[] arr) {
        if (arr.length == 0) return false;
        for (int i = 0; i < arr.length; i++) {
            boolean isNice = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] + 1 || arr[i] == arr[j] - 1) {
                    isNice = true;
                    break;
                }
            }
            if (!isNice) return false;
        }
        return true;
    }

    public static boolean isNice1(int[] arr) {
        if (arr.length == 0) return false;
        return Arrays.stream(arr)
                .allMatch(num -> Arrays.stream(arr)
                        .anyMatch(n -> n == num + 1 || n == num - 1));
    }
}
