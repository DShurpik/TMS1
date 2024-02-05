package codewars.level8.string;

public class Reverse_string_stringBuilder {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(solution("hello"));
        System.out.println(solution("Codewars rules"));
    }
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
