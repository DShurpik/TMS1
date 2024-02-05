package codewars.level7.fundamentals;
// https://www.codewars.com/kata/59a8570b570190d313000037/train/java

public class SumOfCubes {
    public static void main(String[] args) {
        System.out.println(sumCubes(4)); // 100
        System.out.println(sumCubes(10)); // 3025
    }

    public static long sumCubes(long n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (long) i * i * i;
        }
        return sum;
    }
}
