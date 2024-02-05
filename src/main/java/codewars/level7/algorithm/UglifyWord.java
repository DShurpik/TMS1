package codewars.level7.algorithm;
// https://www.codewars.com/kata/5ce6cf94cb83dc0020da1929/train/java
public class UglifyWord {
    public static void main(String[] args) {
        System.out.println(uglifyWord("AAA"));
        System.out.println(uglifyWord("aaa-bbb-ccc"));
        System.out.println(uglifyWord("Hello World"));
        System.out.println(uglifyWord("EeEe-fFfF-GgGg"));
    }

    public static String uglifyWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 1;
        for (Character c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (flag == 1) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
                flag = 1 - flag;
            } else {
                stringBuilder.append(c);
                flag = 1;
            }
        }
        return stringBuilder.toString();
    }
}
