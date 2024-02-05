package codewars.level7.strings;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("apple"));
        System.out.println(reverseWords("     "));
    }

    public static String reverseWords(final String original) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = original.split("(?<= )|(?= )"); // regex делает массив вида ["word", " ", "word"]
        for (int j = 0; j < arr.length; j++) {
            if(arr[j].trim().isEmpty()) {
                stringBuilder.append(arr[j]);
            } else {
                for (int i = arr[j].length() - 1; i >= 0; i--) {
                    stringBuilder.append(arr[j].charAt(i));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String reverseWords1(final String original) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = original.split(" ");
        if (arr.length == 0) {
            return original;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = arr[j].length() - 1; i >= 0; i--) {
                stringBuilder.append(arr[j].charAt(i));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
