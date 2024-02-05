package codewars.level8.fundamentals;

public class IsItADigit {
    public static void main(String[] args) {
        System.out.println(isDigit("7"));
        System.out.println(isDigit("a"));
        System.out.println(isDigit("a5"));
        System.out.println(isDigit("19"));
    }

    public static boolean isDigit(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
