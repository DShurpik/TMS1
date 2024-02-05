package codewars.level7.strings;

import java.util.stream.Stream;

// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps")); // 3
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones")); // 3
        System.out.println(findShort("Let's travel abroad shall we")); // 2
    }

    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int count = arr[0].length();
        for (String str : arr) {
            if (str.length() < count) {
                count = str.length();
            }
        }
        return count;
    }

    public static int findShort1(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
