package codewars.level7.fundamentals;

public class SimpleStringReversal {
    public static void main(String[] args) {
        System.out.println(solve("codewars"));
        System.out.println(solve("your code"));
        System.out.println(solve("your code rocks"));
    }

    public static String solve(String s){
        StringBuilder result = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            }
        }
        result.reverse();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result.insert(i, ' ');
            }
        }
        return result.toString();
    }
}
