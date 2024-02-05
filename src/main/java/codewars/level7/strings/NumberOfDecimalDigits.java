package codewars.level7.strings;
// https://www.codewars.com/kata/58fa273ca6d84c158e000052/train/java
public class NumberOfDecimalDigits {
    public static void main(String[] args) {
        System.out.println(Digits(9876543210l)); // 10
        System.out.println(Digits(12345l)); // 5
    }

    public static int Digits(long n) {
        return Long.toString(n).length();
    }
}
