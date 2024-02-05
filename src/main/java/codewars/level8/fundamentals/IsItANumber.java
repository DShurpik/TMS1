package codewars.level8.fundamentals;

public class IsItANumber {
    public static void main(String[] args) {
        System.out.println(isDigit("3"));
        System.out.println(isDigit("  3  "));
        System.out.println(isDigit("-234.5"));
        System.out.println(isDigit("3-4"));
    }

    public static boolean isDigit(String s) {
        try {
            Double.parseDouble(s.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


}
