package codewars.level7.strings;

public class CompleteThePattern {
    public static void main(String[] args) {
        System.out.println(pattern(11));
    }

    public static String pattern(int n){
        if (n < 1) return "";
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                str.append(i);
            }
            str.append("\n");
        }
        return str.toString().trim();
    }
}
