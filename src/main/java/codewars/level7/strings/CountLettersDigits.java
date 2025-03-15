package codewars.level7.strings;

public class CountLettersDigits {
    public static void main(String[] args) {
        System.out.println(countLettersAndDigits("wicked .. !")); // 6
        System.out.println(countLettersAndDigits1("wicked .. !")); // 6
    }

    public static int countLettersAndDigits(String input){
        return input.replaceAll("[^a-zA-Z0-9]", "").length();
    }

    public static int countLettersAndDigits1(String input){
        int count = 0;
        for (Character c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
