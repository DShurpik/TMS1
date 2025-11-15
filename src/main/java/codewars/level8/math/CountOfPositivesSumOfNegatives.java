package codewars.level8.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        /** Посчитать в массиве количество положительных и сумму отрицательных, и вернуть в виде массива*/
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] arr = new int[2];
        int count = 0;
        int sum = 0;
        if (input == null || input.length == 0) return new int[]{};
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        arr[0] = count;
        arr[1] = sum;
        return arr;
    }

    public static int[] countPositivesSumNegatives1(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int count = Math.toIntExact(Arrays.stream(input).filter(x -> x > 0).count());
        int sum = Arrays.stream(input).filter(x -> x < 0).sum();
        return new int[]{count, sum};
    }

    public static int[] countPositivesSumNegatives2(int[] input) {
        return input == null || input.length == 0 ?
                new int[0] :
                new int[] { (int) IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
    }
}
