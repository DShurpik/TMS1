package codewars.level8.string;

public class SubtractSum {
    public static void main(String[] args) {
        System.out.println(subtractSum(10));
    }

    public static String subtractSum (int n) {
        int sum = n - (n / 10);
        if (sum == 9) {
            return "apple";
        }
        return "";
    }
}
