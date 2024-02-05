package codewars.level7.strings;
// https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test")); // es
        System.out.println(getMiddle("testing")); // t
    }

    public static String getMiddle(String word) {
        int mid = word.length() / 2;
        if (word.length() % 2 != 0) {
            String res = String.valueOf(word.charAt(mid));
            return res;
        } else {
            String res1 = String.valueOf(word.charAt(mid - 1)) + String.valueOf(word.charAt(mid));
            return res1;
        }
    }

    public static String getMiddle1(String word) {
        if (word.length() % 2 == 1) {
            return Character.toString(word.charAt(word.length() / 2));
        } else {
            return Character.toString(word.charAt(word.length() / 2 - 1)) + Character.toString(word.charAt(word.length() / 2));
        }
    }
}
