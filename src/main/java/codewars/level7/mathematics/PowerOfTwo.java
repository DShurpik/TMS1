package codewars.level7.mathematics;
// https://www.codewars.com/kata/534d0a229345375d520006a0/train/java

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4096)); // true
        System.out.println(isPowerOfTwo(2)); // true
        System.out.println(isPowerOfTwo(333)); // false
    }

    public static boolean isPowerOfTwo(long n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
