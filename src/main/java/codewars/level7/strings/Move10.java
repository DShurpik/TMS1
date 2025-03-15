package codewars.level7.strings;

public class Move10 {
    public static void main(String[] args) {
        System.out.println(moveTen("testcase")); // "docdmkco"
    }

    public static String moveTen(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) + 10 > 122) {
                res += (char) ((s.charAt(i) + 10) % 122 + 96);
            } else res += (char) (s.charAt(i) + 10);

        }
        return res;
    }
}
