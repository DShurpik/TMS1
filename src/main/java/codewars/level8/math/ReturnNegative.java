package codewars.level8.math;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(5));
    }
    public static int makeNegative(final int x) {
        if (x < 0) return x;
        if (x == 0) return 0;
        else return x * (-1);
    }
}
