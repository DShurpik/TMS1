package codewars.level8.string;

public class ConvertBoolToStr {
    public static void main(String[] args) {
        System.out.println(boolToWord(false));
        System.out.println(boolToWord(true));
    }
    public static String boolToWord(boolean b)
    {
        if(b == true) {
            return "Yes";
        }
        return "No";
    }
}
