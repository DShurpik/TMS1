package codewars.level7.fundamentals;

public class ValidSpacing {
    public static boolean validSpacing(String s) {
        if (s.isEmpty()) return true;
        if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') return false;
        for (int i = 1; i < s.length() - 2; i++) {
            if (s.charAt(i + 1) == ' ' && s.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validSpacing("Hello world"));
        System.out.println(validSpacing("Hello world  "));
        System.out.println(validSpacing(" Hello world"));
    }
}
