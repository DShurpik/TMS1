package codewars.level8.string;

public class ParseNiceIntFromCharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("1 year old"));
        System.out.println(howOld("5 years old"));
        System.out.println(howOld("8 years old"));
    }
    public static int howOld(final String herOld) {
        String[] s = herOld.split(" ");
        return Integer.valueOf(s[0]);
    }
}
