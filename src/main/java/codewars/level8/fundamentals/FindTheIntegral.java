package codewars.level8.fundamentals;

public class FindTheIntegral {
    public static void main(String[] args) {
        System.out.println(integrate(90, 2)); // "30x^3"
        System.out.println(integrate(3,2));   // "1x^3"

        System.out.println(integrate1(90, 2)); // "30x^3"
        System.out.println(integrate1(3,2));   // "1x^3"
    }

    public static String integrate(int coefficient, int exponent) {
        exponent = exponent + 1;
        coefficient = coefficient / exponent;
        return coefficient + "x^" + exponent;
    }

    public static String integrate1(int coefficient, int exponent) {
        return String.format("%dx^%d", coefficient / (exponent + 1), exponent + 1);
    }
}
