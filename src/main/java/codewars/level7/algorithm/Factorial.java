package codewars.level7.algorithm;
// https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(13));
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException ("Input is out of range. It should be between 0 and 12.");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
