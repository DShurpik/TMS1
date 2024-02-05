package codewars.level7.algorithm;

public class LargestDigitNumberInSeries {
    public static void main(String[] args) {
        System.out.println(solve("283910")); // 83910
        System.out.println(solve("1234567890")); // 67890
        System.out.println(solve("731674765")); // 74765
    }

    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            int number = Integer.parseInt(digits.substring(i, i + 5));
            max = Math.max(max, number);
        }
        return max;
    }
}
