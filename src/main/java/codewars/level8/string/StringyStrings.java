package codewars.level8.string;

public class StringyStrings {
    public static void main(String[] args) {
        System.out.println(stringy(4)); // '1010'
        System.out.println(stringy(6)); // '101010'
        System.out.println(stringy(12)); // '101010101010'
        System.out.println(stringy(11));
    }

    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }

        }
        return stringBuilder.toString();
    }

}
