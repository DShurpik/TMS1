package codewars.level7.strings;

import java.util.HashSet;
import java.util.Set;

public class SearchLetters {
    public static void main(String[] args) {
        System.out.println(search("abcdefghijklmnopqrstuvwxyz")); // 11111111111111
        System.out.println(search("aaaaaaaaaaa")); // 100000000000000
        System.out.println(search("&%&%/$%$%$%$%GYtf67fg34678hgfdyd")); // "00010111000000000001000010"
    }

    public static String search(String line){
        String s = line.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 97; i < 123; i++) {
            if (set.contains((char) i)) stringBuilder.append("1");
            else stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }
}
