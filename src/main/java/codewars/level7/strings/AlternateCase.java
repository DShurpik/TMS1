package codewars.level7.strings;

public class AlternateCase {
    static String alternateCase(final String string) {
        String res = string;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i) >= 'a' && res.charAt(i) <= 'z') {
                str.append(Character.toUpperCase(res.charAt(i)));
            } else {
                str.append(Character.toLowerCase(res.charAt(i)));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String result = alternateCase("Hello World!");
        System.out.println(result);
    }
}
