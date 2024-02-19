package codewars.level7.strings;

public class StringMerge {
    public static String stringMerge(String s1, String s2, char letter) {
        int index1 = 0;
        int index2 = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == letter) index1 = i;
        }
        for (int i = s2.length() - 1; i >= 0; i--) {
            if (s2.charAt(i) == letter) index2 = i;
        }
        String subStr1 = s1.substring(0, index1);
        String subStr2 = s2.substring(index2);
        return subStr1 + subStr2;
    }

    public static String stringMerge1(String s1, String s2, char letter) {
        return s1.substring(0,s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }

    public static void main(String[] args) {
        System.out.println(stringMerge("person","here", 'e'));
    }
}
