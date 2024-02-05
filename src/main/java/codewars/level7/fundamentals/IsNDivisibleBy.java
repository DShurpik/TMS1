package codewars.level7.fundamentals;
// https://www.codewars.com/kata/558ee8415872565824000007/train/java
public class IsNDivisibleBy {
    public static void main(String[] args) {
        System.out.println(isDivisible(12, 3, 4)); // true
        System.out.println(isDivisible(100,5,4,10,25,20)); // true
        System.out.println(isDivisible(8, 3, 4, 2, 5)); // false
        System.out.println(isDivisible(100, 20, 5, 25, 3));
    }

    public static boolean isDivisible(int... values) {
        boolean isDivisible = true;
        for (int i = 1; i < values.length; i++) {
            if (values[0] % values[i] != 0) {
                isDivisible = false;
            }
        }
        return isDivisible;
    }
}
