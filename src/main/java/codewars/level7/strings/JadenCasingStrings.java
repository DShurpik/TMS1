package codewars.level7.strings;
// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

public class JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isWhitespace(phrase.charAt(i))) {
                flag = true;
                stringBuilder.append(phrase.charAt(i));
            } else if (flag) {
                stringBuilder.append(Character.toUpperCase(phrase.charAt(i)));
                flag = false;
            } else {
                stringBuilder.append(phrase.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
