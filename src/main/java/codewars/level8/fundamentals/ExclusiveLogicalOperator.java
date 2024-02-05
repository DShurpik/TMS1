package codewars.level8.fundamentals;

public class ExclusiveLogicalOperator {
    public static void main(String[] args) {
        System.out.println(xor(false, false)); // false
        System.out.println(xor(true, false)); // true
        System.out.println(xor(false, true)); // true
        System.out.println(xor(true, true)); // false

    }
    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }
}
