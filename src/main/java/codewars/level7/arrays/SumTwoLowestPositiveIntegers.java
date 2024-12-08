package codewars.level7.arrays;

import java.util.Arrays;

public class SumTwoLowestPositiveIntegers {
    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNumbers(new long[]{52, 76, 14, 12, 4})); // 16l
        System.out.println(sumTwoSmallestNumbers1(new long[]{1, 876, 234234, 45345, 34435})); // 877l
        System.out.println(sumTwoSmallestNumbers1(new long[]{3, 87, 3, 12, 7})); // 6
        System.out.println(sumTwoSmallestNumbers2(new long[]{11, 3, 9, 10, 14, 3})); // 6
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }

    public static long sumTwoSmallestNumbers1(long[] numbers) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for (long l : numbers) {
            if (l < min1) {
                min2 = min1;
                min1 = l;
            } else if (l < min2) {
                min2 = l;
            }
        }
        return min2 + min1;
    }

    public static long sumTwoSmallestNumbers2(final long [] numbers) {
        return Arrays.stream(numbers)
                .sorted()
                .limit(2)
                .sum();
    }
}
