package codewars.level7.arrays;

import java.util.Arrays;

public class MaximumGap {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int gap = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] - numbers[i] > gap) {
                gap = numbers[i + 1] - numbers[i];
            }
        }
        return gap;
    }

    public static void main(String[] args) {
        int result = maxGap(new int[]{24,299,131,14,26,25}); // 168
        int result1 = maxGap(new int[]{-7,-42,-809,-14,-12}); // 767
        System.out.println(result);
        System.out.println(result1);
    }
}
