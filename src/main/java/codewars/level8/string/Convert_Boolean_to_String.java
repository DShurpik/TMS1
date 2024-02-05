package codewars.level8.string;

public class Convert_Boolean_to_String {
    public static void main(String[] args) {
        System.out.println(convert(false));
        System.out.println(convert(true));
    }
    public static String convert(boolean b) {
        return Boolean.toString(b);
    }
}
