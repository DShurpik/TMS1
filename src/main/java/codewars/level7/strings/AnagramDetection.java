package codewars.level7.strings;

import java.util.Arrays;

// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee")); // true
        System.out.println(isAnagram("Twoo", "Woot")); // true
        System.out.println(isAnagram("apple", "aplle")); // false
        System.out.println(isAnagram("apple", "pale")); // false
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;
        char[] arrTest = test.toLowerCase().toCharArray();
        char[] arrOriginal = original.toLowerCase().toCharArray();
        Arrays.sort(arrTest);
        Arrays.sort(arrOriginal);
        return Arrays.equals(arrTest, arrOriginal);
    }
}
