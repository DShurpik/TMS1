package codewars.level8.string;

public class Abbreviature_from_string {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feeney"));
    }
    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        String a = String.valueOf(words[0].charAt(0)).toUpperCase();
        String b = String.valueOf(words[1].charAt(0)).toUpperCase();
        return name = a + "." + b;
    }
}
