package codewars.level8.string;

public class TripleTrouble {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa","bb","cc")); // "abcabc"
        System.out.println(tripleTrouble("Bm", "aa", "tn")); // "Batman"
    }

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length(); i ++) {
            stringBuilder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return stringBuilder.toString();
    }
}
