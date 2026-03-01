package codewars.level7.fundamentals;

import java.util.Map;

public class MakeBackronym {

    private static Map<String, String> dictionary;
    public static void main(String[] args) {
        System.out.println(makeBackronym("dgm"));    // dgm
        System.out.println(makeBackronym("codewars")); // codewars
    }

    public static String makeBackronym(String acronym) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < acronym.length(); i++) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(dictionary.get(String.valueOf(acronym.charAt(i)).toUpperCase()));
        }
        return sb.toString();
    }
}
