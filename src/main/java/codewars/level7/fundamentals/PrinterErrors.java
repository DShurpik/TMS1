package codewars.level7.fundamentals;
// https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java
public class PrinterErrors {
    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")); // 3/56
    }

    public static String printerError(String s) {
        int errorCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'm') {
                errorCount++;
            }
        }
        return String.format("%d/%d", errorCount, s.length());
    }

    public static String printerError1(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
