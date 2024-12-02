package codewars.level8.chars;


public class AlternatingCaseAlternatingCase {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));//HELLO WORLD
        System.out.println(toAlternativeString("123"));//123
        System.out.println(toAlternativeString("1a2B"));//1A2b

        char[] f = new char[]{'h', 'e', 'l', 109, 'e', 't'};
        System.out.println(new String(f));

    }
    public static String toAlternativeString(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }



}
