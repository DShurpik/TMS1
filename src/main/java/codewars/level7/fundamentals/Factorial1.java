package codewars.level7.fundamentals;
// https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/java

public class Factorial1 {
    public static void main(String[] args) {
        System.out.println(factorial(0)); // 1l
        System.out.println(factorial(1)); // 1l
        System.out.println(factorial(4)); // 24l
        System.out.println(factorial(7)); // 5040l
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
