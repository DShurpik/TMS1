package codewars.level7.strings;

public class LoveVsFriendship {
    public static void main(String[] args) {
        System.out.println(wordsToMarks("incomprehensibility")); // 225
    }

    public static int wordsToMarks (String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            sum += Character.getNumericValue(text.charAt(i)) - 9;
        }
        return sum;
    }
}
