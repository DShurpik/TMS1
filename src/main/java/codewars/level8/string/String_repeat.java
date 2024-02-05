package codewars.level8.string;

public class String_repeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(5,"Hello "));
        System.out.println(repeatStr(10, "I am "));
    }
    public static String repeatStr(final int repeat, final String string) {
        if(repeat == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < repeat - 1; i++) {
            stringBuilder.append(string);
        }
        return String.valueOf(stringBuilder);
    }
}
