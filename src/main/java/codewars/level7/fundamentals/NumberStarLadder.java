package codewars.level7.fundamentals;

public class NumberStarLadder {
    public static void main(String[] args) {
        System.out.println(pattern(20));
        System.out.println(pattern(1));
        System.out.println(pattern(3));
    }

    public static String pattern(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) stringBuilder.append(j);
                else stringBuilder.append("*");
                if (j == i && j != 1) stringBuilder.append(j);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString().strip();
    }

    public static String pattern1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) sb.append("\n");
            sb.append("1");
            if (i > 1) sb.append("*".repeat(i - 1)).append(i);
        }
        return sb.toString();
    }
}
