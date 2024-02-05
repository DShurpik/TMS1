package codewars.level8.string;

public class Remove_exclamation_marks {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello world!!!!"));//Hello world
        System.out.println(removeExclamationMarks("H!e!l!l!o"));//Hello
    }
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
