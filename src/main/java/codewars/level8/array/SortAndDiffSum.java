package codewars.level8.array;

import java.util.Arrays;
import java.util.Collections;

public class SortAndDiffSum {
    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));//9
        System.out.println(sumOfDifferences(new int[]{-17, 17}));//34
        System.out.println(sumOfDifferences(new int[]{-3, -2, -1}));//2
        System.out.println(sumOfDifferences(new int[]{1, 1, 1, 1, 1}));//0
    }
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length == 1 || arr.length == 0) return 0;
        int sum = 0;
        int[] sortedDesc = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        if (sortedDesc.length == 2) return sortedDesc[0] - sortedDesc[1];
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr1[i] = sortedDesc[i] - sortedDesc[i+1];
        }

        for (int i = 0; i < arr1.length; i++) {
            sum = sum + (arr1[i]);
        }
        return sum;
    }
}
