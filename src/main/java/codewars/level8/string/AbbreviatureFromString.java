package codewars.level8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviatureFromString {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feeney"));

        System.out.println(abbrevName1("Sam Harris"));
        System.out.println(abbrevName1("patrick feeney"));
    }
    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        String a = String.valueOf(words[0].charAt(0)).toUpperCase();
        String b = String.valueOf(words[1].charAt(0)).toUpperCase();
        return a + "." + b;
    }

    public static String abbrevName1(String name) {
        return Arrays.stream(name.split(" "))
                .map(String:: toUpperCase)
                .map(x -> x.substring(0, 1))
                .collect(Collectors.joining("."));
    }
}
