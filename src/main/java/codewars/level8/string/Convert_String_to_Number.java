package codewars.level8.string;

public class Convert_String_to_Number {
    public static void main(String[] args) {
        System.out.println(stringToNumber("12345"));//12345
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
