package codewars.level8.fundamentals;

public class RegexpBasics {
    public static void main(String[] args) {
        System.out.println(isDigit(""));
        System.out.println(isDigit("7"));
        System.out.println(isDigit("14"));
    }

    public static boolean isDigit(String s) {
        return s.matches("^[0-9]$");
    }

    public static boolean isDigit1(String s) {
        if(s.length() != 1 || s.charAt(0) < '0' || s.charAt(0) > '9') return false;
        return true;
    }


}
