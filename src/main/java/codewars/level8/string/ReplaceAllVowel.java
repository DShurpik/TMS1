package codewars.level8.string;

public class ReplaceAllVowel {
    public static void main(String[] args) {
        System.out.println(replace("Hi!")); // "H!!"
        System.out.println(replace1("ABCDE")); // "!BCD!"
    }

    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static String replace1(final String s) {
        char[] chrs = s.toCharArray();
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < chrs.length; i++) {
            for(int j = 0; j < vowel.length; j++) {
                if(chrs[i] == vowel[j]) chrs[i] = '!';
            }
        }
        return new String(chrs);
    }
}
