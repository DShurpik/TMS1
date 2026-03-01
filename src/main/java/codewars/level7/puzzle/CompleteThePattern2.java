package codewars.level7.puzzle;

public class CompleteThePattern2 {
    public static void main(String[] args) {
        System.out.println(pattern(5)); // "54321\n5432\n543\n54\n5"
        System.out.println(pattern(1)); // 1
        System.out.println(pattern(11));
    }

    public static String pattern ( int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                sb.append(n - j);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
