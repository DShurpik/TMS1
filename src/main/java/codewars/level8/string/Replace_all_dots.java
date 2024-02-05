package codewars.level8.string;

public class Replace_all_dots {
    public static void main(String[] args) {
        System.out.println(replaceDots("one.two.three"));
    }

    public static String replaceDots(final String str) {
        return str.replace(".", "-");
    }
}
