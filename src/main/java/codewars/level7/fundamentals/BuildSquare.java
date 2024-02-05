package codewars.level7.fundamentals;
// https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java

public class BuildSquare {
    public static void main(String[] args) {
        System.out.println(generateShape1(3));
    }

    public static final String generateShape(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("+");
        }
        stringBuilder.append("\n");
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder1.append(stringBuilder);
        }
        return stringBuilder1.deleteCharAt(stringBuilder1.length() - 1).toString();
    }

    public static final String generateShape1(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stringBuilder.append("+");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString().trim();
    }
}
