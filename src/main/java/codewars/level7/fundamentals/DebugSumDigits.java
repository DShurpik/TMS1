package codewars.level7.fundamentals;

public class DebugSumDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        String digits = String.valueOf(n);
        for (int i = 0; i < digits.length(); i++) {
            char digitChar = digits.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        return sum;
    }

    public static int sumOfDigits1(int n) {
        int sum = 0;
        String[] digits = (n + "").split("");
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = sumOfDigits(123);
        int i1 = sumOfDigits1(123);
        System.out.println(i); // 6
        System.out.println(i1);
    }
}
