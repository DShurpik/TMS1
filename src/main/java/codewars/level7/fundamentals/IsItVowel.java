package codewars.level7.fundamentals;

public class IsItVowel {
    public static void main(String[] args) {
        System.out.println(isVowel("a")); // true
        System.out.println(isVowel("E")); // true
        System.out.println(isVowel("ou")); // false
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }
}
