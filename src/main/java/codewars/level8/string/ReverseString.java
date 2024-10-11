package codewars.level8.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(solution("hello"));
        System.out.println(solution("Codewars rules"));

        System.out.println(solution1("world"));
    }
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String solution1(String s) {
        char[] c = s.toCharArray();
        char[] cNew = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            cNew[i] = c[c.length - i - 1];
        }
        return new String(cNew);
    }
}
