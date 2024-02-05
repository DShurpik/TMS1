package codewars.level7.strings;
// https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java
public class InspiringStrings {
    public static void main(String[] args) {
        System.out.println(longestWord("a b c d e fgh")); // fgh
        System.out.println(longestWord("one two three")); // three 
        System.out.println(longestWord("red blue grey")); // grey
    }

    public static String longestWord(String wordString) {
        String[] arr = wordString.split(" ");
        int max = Integer.MIN_VALUE;
        String ret = null;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i].length()) {
                ret = arr[i];
                max = arr[i].length();
            }
        }
        return ret;
    }
}
