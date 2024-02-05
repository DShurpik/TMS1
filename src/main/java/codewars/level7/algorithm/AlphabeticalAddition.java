package codewars.level7.algorithm;

public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
        if (letters == null || letters.length == 0) {
            return "z";
        }
        int sum = 0;
        for (String letter : letters) {
            sum += letter.charAt(0) - 'a' + 1;
        }
        sum = (sum - 1) % 26 + 1;
        char result = (char) ('a' + sum - 1);
        return Character.toString(result);
    }

    public static void main(String[] args) {
        String res = addLetters("a", "c", "b");
        System.out.println(res); // "f"
    }
}
