package codewars.level7.arrays;
// https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java


import java.util.Arrays;

public class MinimizeSumOfArray {
    public static void main(String[] args) {
        System.out.println(minSum(new int[]{9,2,8,7,5,4,0,6})); // 74
        System.out.println(minSum(new int[]{12,6,10,26,3,24})); // 342
    }

    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int start = 0;
        int end = passed.length - 1;
        int mid = passed.length / 2;
        int sum = 0;
        while (start < mid) {
            sum = sum + passed[start] * passed[end];
            start++;
            end--;
        }
        return sum;
    }
}
