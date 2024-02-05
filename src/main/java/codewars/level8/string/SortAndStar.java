package codewars.level8.string;

import java.util.Arrays;

public class SortAndStar {
    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println(twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    public static String twoSort(String[] s) {
        String string;
        int min = 0;
        char minChar = s[0].charAt(0);
        for (int i = 1; i < s.length - 1; i++) {
            if (s[i].charAt(0) < minChar) {
                min = i;
                minChar = s[i].charAt(0);
            }
        }
        string = s[min];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() - 1; i++) {
            stringBuilder.append(string.charAt(i)).append("***");
        }
        stringBuilder.append(string.charAt(string.length() - 1));
        return stringBuilder.toString();
    }

    public static String twoSort1(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
    }

    public static String twoSort2(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}
