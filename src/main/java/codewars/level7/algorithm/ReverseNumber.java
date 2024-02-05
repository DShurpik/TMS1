package codewars.level7.algorithm;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123)); // 321
        System.out.println(reverse(-321)); // -123
        System.out.println(reverse(1000)); // 1
    }

    public static int reverse(int number) {
        String str = new StringBuilder(Integer.toString(Math.abs(number))).reverse().toString();
        if (number < 0) {
            return Integer.parseInt(str) * -1;
        } else {
            return Integer.parseInt(str);
        }
    }
}
