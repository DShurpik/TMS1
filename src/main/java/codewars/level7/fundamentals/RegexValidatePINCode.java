package codewars.level7.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
public class RegexValidatePINCode {
    public static void main(String[] args) {
        System.out.println(validatePin("1234")); // true
        System.out.println(validatePin("a234")); // false
        System.out.println(validatePin("12345")); // false
    }

    public static boolean validatePin(String pin) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(pin);
        return pin.length() == 4 && matcher.matches() || pin.length() == 6 && matcher.matches();
    }

    public static boolean validatePin1(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
