package codewars.level8.math;

import java.util.stream.IntStream;

public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(8));
        System.out.println(summation1(8));
    }

    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }

    public static int summation1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
