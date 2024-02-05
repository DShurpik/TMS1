package codewars.level7.strings;
// https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java

public class AlternateCapitalization {
    public static void main(String[] args) {
        String[] arr = capitalize("abcdef");
        String[] arr1 = capitalize("codewars");
        for (String s : arr) {
            System.out.println(s);
        }

        for (String s : arr1) {
            System.out.println(s);
        }
    }

    public static String[] capitalize(String s){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                str1.append(Character.toUpperCase(s.charAt(i)));
                str2.append(s.charAt(i));
            } else {
                str1.append(s.charAt(i));
                str2.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return new String[]{str1.toString(), str2.toString()};
    }
}
