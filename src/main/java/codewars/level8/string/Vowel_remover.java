package codewars.level8.string;

public class Vowel_remover {
    public static void main(String[] args) {
        System.out.println(shortcut("hello"));//hll
    }
    public static String shortcut(String input) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i ++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' ||
                    input.charAt(i) == 'u') {

            } else {
                str = str.append(input.charAt(i));
            }
        }
        return str.toString();
    }
}
