package codewars.level8.algoritmes;

public class easyLogs {
    public static void main(String[] args) {
        System.out.println(logs(10, 2, 3));
    }

    public static double logs(double x, double a, double b) {
        return Math.log(a * b) / Math.log(x);
    }
}
