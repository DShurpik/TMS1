package codewars.level8.string;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(5,"Hello "));
        System.out.println(repeatStr1(10, "I am "));
        System.out.println(repeatStr2(5, "Hello"));
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

    public static String repeatStr1(final int repeat, final String string) {
        String res = "";
        for (int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }

    public static String repeatStr2(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
