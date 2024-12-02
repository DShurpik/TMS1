package codewars.level8.string;

public class SentenceSmash {
    public static void main(String[] args) {
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
        System.out.println(smash(new String[] { "Bilal"}));
    }

    public static String smash(String... words) {

        //String.join(" ", words);

        StringBuilder stringBuilder = new StringBuilder();
        if (words.length == 1) {
            return words[0];
        } else {
            for (int i = 0; i < words.length; i++) {
                stringBuilder.append(words[i] + " ");
            }
            return stringBuilder.toString().trim();
        }
    }
}
