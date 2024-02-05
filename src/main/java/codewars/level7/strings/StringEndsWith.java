package codewars.level7.strings;

public class StringEndsWith {
    // https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("abcabc", "bc"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
