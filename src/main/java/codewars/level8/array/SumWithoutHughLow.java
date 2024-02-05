package codewars.level8.array;

import java.util.Arrays;

public class SumWithoutHughLow {
    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10})); // 16
        System.out.println(sum(new int[] {1,3, 2}));
        System.out.println(sum(new int[] {1}));
    }

    public static int sum(int[] numbers) {
        if(numbers == null) return 0;
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i ++) {
            sum += numbers[i];
        }
        return sum;
    }
}
