package codewars.level8.string;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
    }

    public static String doubleChar(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i)).append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
