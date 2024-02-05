package codewars.level7.arrays;
// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java

import java.util.Arrays;

public class FlattenAndSortArray {
    public static void main(String[] args) {
        int[] arr = flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}); // 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] arr1 = flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}); // 1, 2, 3, 4, 5, 6, 100
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static int[] flattenAndSort(int[][] array) {
        int lenght = 0;
        for (int[] ints : array) {
            lenght = lenght + ints.length;
        }
        int[] result = new int[lenght];
        int countRes = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                result[countRes] = anInt;
                countRes++;
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }
}
