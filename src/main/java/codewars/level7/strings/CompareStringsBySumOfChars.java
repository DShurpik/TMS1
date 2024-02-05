package codewars.level7.strings;

// https://www.codewars.com/kata/576bb3c4b1abc497ec000065/train/java
public class CompareStringsBySumOfChars {
    public static void main(String[] args) {
        System.out.println(compare("AD", "BC")); // true
        System.out.println(compare("AD", "DD")); // false
        System.out.println(compare("zz1",  "")); // true
    }

     public static boolean compare(String s1, String s2) {
         if (s1 == null) {
             s1 = "";
         }
         if (s2 == null) {
             s2 = "";
         }
         String s11 = s1.toUpperCase();
         String s22 = s2.toUpperCase();
         boolean containsDigits = false;
         for (int i = 0; i < s11.length(); i++) {
             if (Character.isDigit(s11.charAt(i))) {
                 containsDigits = true;
                 break;
             }
         }
         for (int i = 0; i < s22.length(); i++) {
             if (Character.isDigit(s22.charAt(i))) {
                 containsDigits = true;
                 break;
             }
         }

         if (containsDigits) {
             return true;
         }

             int sum1 = 0;
             int sum2 = 0;
             for (int i = 0; i < s11.length(); i++) {
                 char c1 = s11.charAt(i);
                 sum1 = sum1 + (int) c1;
             }
             for (int i = 0; i < s22.length(); i++) {
                 char c2 = s22.charAt(i);
                 sum2 = sum2 + (int) c2;
             }
             return sum1 == sum2;
         }

     }
