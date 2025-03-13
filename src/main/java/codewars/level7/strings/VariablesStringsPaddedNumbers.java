package codewars.level7.strings;

public class VariablesStringsPaddedNumbers {
    public static void main(String[] args) {
        System.out.println(solution(1204)); // "Value is 01204"
        System.out.println(solution(109)); // Value is 00109
        System.out.println(solution(5));
    }

    public static String solution(int value) {
        String res = Integer.toString(value);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = res.length() - 1; i >= 0; i--) {
            stringBuilder.append(res.charAt(i));
        }
        for (int i = stringBuilder.length() - 1; i < 4; i++) {
            stringBuilder.append("0");
        }
        return "Value is " + stringBuilder.reverse().toString();
    }

    public static String solution1(int value) {
        return String.format("Value is %05d", value); // your code here
    }
}
