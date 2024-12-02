package codewars.level8.string;

public class ConvertStringNumber {
    public static void main(String[] args) {
        System.out.println(stringToNumber("12345"));//12345
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
