package codewars.level8.fundamentals;

public class CompareWithinMargin {
    public static void main(String[] args) {
        System.out.println(closeCompare(4, 5));
        System.out.println(closeCompare(5, 5));
        System.out.println(closeCompare(6, 5));

        System.out.println("====");

        System.out.println(closeCompare(2, 5, 3));
        System.out.println(closeCompare(8.1, 5, 3));
        System.out.println(closeCompare(1.99, 5, 3));

    }

    public static int closeCompare(double a, double b) {
        return a == b ? 0 : a < b ? -1 : 1;
    }

    public static int closeCompare(double a, double b, double margin) {
        return  Math.abs(a - b) <= margin ? 0 : a - b < margin ? -1 : 1;
    }
}
