package codewars.level7.algorithm;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(compute(30,12)); // 6
        System.out.println(compute(8,9));
    }

    public static int compute(int x, int y) {
        int div = 1;
        int t;
        if (x > y) {
            t = x;
        } else t = y;
        for (int i = 1; i < t; i++) {
            if (x % i == 0 && y % i == 0) {
                div = i;
            }
        }
        return div;
    }
}
