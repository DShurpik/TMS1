package codewars.level7.strings;
// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

import java.util.Arrays;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere")); // aehrsty
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding")); // abcdefghilnoprstu
        System.out.println(longest("inmanylanguages", "theresapairoffunctions")); // acefghilmnoprstuy
    }

    public static String longest (String s1, String s2) {
        char[] arr = (s1 + s2).toCharArray();
        Arrays.sort(arr);
        String res = new String(arr);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(res.charAt(0));
        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i) != res.charAt(i - 1)) {
                stringBuilder.append(res.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
