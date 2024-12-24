package codewars.level7.algorithm;

public class RotateForMax {
    public static void main(String[] args) {
        System.out.println(maxRot(38458215)); // 85821534
    }

    public static long maxRot (long n) {
        String input = String.valueOf(n);
        for (int i = 0; i < input.length() - 1; i++) {
            input = input.substring(0, i) + input.substring(i + 1, input.length()) + input.charAt(i);
            long current = Long.parseLong(input);
            if (n < current) n = current;
        }
        return n;
    }
}
