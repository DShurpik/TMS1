package codewars.level7.arrays;

import java.util.Arrays;

public class NameArrayCapping {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[]{"Ror", "NOR", "xor"})));
        System.out.println(Arrays.toString(capMe(new String[]{"OZZA", "ARRA", "AZZA"})));
        System.out.println(Arrays.toString(capMe(new String[]{"jo", "nelson", "jurie"})));
        System.out.println(Arrays.toString(capMe(new String[0])));
        System.out.println(Arrays.toString(capMe(new String[]{"", "Anna", "anna"})));
        System.out.println(Arrays.toString(capMe(new String[]{"", "", ""})));
    }

    /**
     * Arrays.stream(names) — converts the String array into a stream so we can process each element with stream operations.
     * .map(s -> ...) — transforms each string s in the stream. Whatever you return inside the map is what replaces the original value.
     * s.isEmpty() ? s : ... — a ternary guard. If the string is empty, return it as-is to avoid charAt(0) throwing an
     * exception on an empty string. Otherwise proceed with the transformation.
     * Character.toUpperCase(s.charAt(0)) — charAt(0) grabs the first character, and Character.toUpperCase() capitalizes it.
     * + s.substring(1).toLowerCase() — substring(1) takes everything from the second character onwards, and
     * .toLowerCase() ensures the rest is lowercased, which handles cases like "KARLY" → "Karly".
     * The + concatenates it with the capitalized first letter.
     * .toArray(String[]::new) — collects the stream back into a String[]. The String[]::new is a constructor
     * reference telling the stream to produce a String array of the right size.
     */

    public static String[] capMe(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .toArray(String[]::new);
    }
}
