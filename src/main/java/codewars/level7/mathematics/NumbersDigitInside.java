package codewars.level7.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class NumbersDigitInside {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbersWithDigitInside(11, 1)));  // [3, 22, 110]
        System.out.println(Arrays.toString(numbersWithDigitInside(20, 0)));  // [2, 30, 200]
        System.out.println(Arrays.toString(numbersWithDigitInside(5, 6)));
        System.out.println(Arrays.toString(numbersWithDigitInside(44, 4)));
        System.out.println(Arrays.toString(numbersWithDigitInside(7, 6)));
    }

    public static long[] numbersWithDigitInside(long x, long d) {
        if (d > x) return new long[] {0, 0, 0};
        List<Long> result = new ArrayList<>();
        for (long i = 1; i <= x; i++) {
            boolean found = false;
            long num = i;
            while (num > 0) {
                if (num % 10 == d) {
                    found = true;
                    break;
                }
                num /= 10;
            }
            if (found) result.add(i);
        }
        return new long[]{result.size(),
                result.stream().mapToLong(Long::longValue).sum(),
                result.stream().mapToLong(Long::longValue).reduce(1L, (a, b) -> a * b)};
    }

    public static long[] NumbersWithDigitInside1(long x, long d) {
        long[] list = LongStream.range(1, x+1).filter(l -> String.valueOf(l).contains(String.valueOf(d))).toArray();
        if(list.length == 0) return new long[]{0, 0, 0};
        LongStream longStream = Arrays.stream(list);
        return new long[]{list.length, longStream.sum(), Arrays.stream(list).reduce(1, (a, b) -> a * b)};
    }
}
