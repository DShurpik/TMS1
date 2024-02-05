package codewars.level7.strings;
//https://www.codewars.com/kata/553e8b195b853c6db4000048/train/java

public class AllUnique {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcde")); // true
        System.out.println(hasUniqueChars("++-")); // false
    }

    public static boolean hasUniqueChars(String str) {
        boolean isUnique = true;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                }
            }
        }
        return isUnique;
    }

    public static boolean hasUniqueChars1(String s) {
        return s.chars().distinct().count() == s.length();
    }
}
