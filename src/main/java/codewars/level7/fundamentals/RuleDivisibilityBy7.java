package codewars.level7.fundamentals;

import java.util.Arrays;

public class RuleDivisibilityBy7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seven(1603))); // [7, 2]
        System.out.println(Arrays.toString(seven(371))); // {35, 1}
        System.out.println(Arrays.toString(seven(483))); // {42, 1}
    }
    public static long[] seven(long m) {
        long number = m;
        long count = 0;
        while (number >= 100) {
            long last = number % 10;
            number = number / 10 - 2 * last;
            count++;
            if (number % 7 == 0 && number < 100) break;
        }
        return new long[] {number, count};
    }
}
