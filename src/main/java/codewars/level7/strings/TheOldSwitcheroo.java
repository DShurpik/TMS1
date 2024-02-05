package codewars.level7.strings;

public class TheOldSwitcheroo {
    public static String vowel2Index(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.toLowerCase().charAt(i)).matches("[aeiou]")) {
                String res = String.valueOf(i + 1);
                str.append(res);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String result = vowel2Index("Codewars is the best site in the world");
        System.out.println(result);
    }
}
