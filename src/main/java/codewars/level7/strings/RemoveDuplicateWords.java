package codewars.level7.strings;
// https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

    public static String removeDuplicateWords(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!result.toString().contains(word)) {
                result.append(word).append(" ");
            }
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}
