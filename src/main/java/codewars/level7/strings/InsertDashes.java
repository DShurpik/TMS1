package codewars.level7.strings;

public class InsertDashes {
    public static void main(String[] args) {
        System.out.println(insertDash(454793)); // "4547-9-3"
        System.out.println(insertDash(1003567)); // 1003-567
    }

    public static String insertDash(int num) {
        String[] str = String.valueOf(num).split("");
        String res = str[0];
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i]) % 2 != 0 && Integer.parseInt(str[i - 1]) % 2 != 0){
                res += "-";
                res += str[i];
            } else {
                res += str[i];
            }
        }
        return res;
    }
}
