package codewars.level7.strings;

public class VAPORCODE {
    public static String vaporcode(String s) {
        String s1 = s.replaceAll(" ", "");
        System.out.println(s1);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s1.length(); i++) {
            str.append(Character.toUpperCase(s1.charAt(i))).append(" ");
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        String res = vaporcode("Why isnt my code working");
        System.out.println(res);
    }
}
