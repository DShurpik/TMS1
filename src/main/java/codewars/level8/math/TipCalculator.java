package codewars.level8.math;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor")); // 2
        System.out.println(calculateTip(20d, "Excellent")); // 4
        System.out.println(calculateTip(20d, "hi")); // null
        System.out.println(calculateTip(107.65, "GReat")); // 17

    }

    public static Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case "terrible":
                return 0;
            case "poor":
                return (int) Math.ceil(amount * 0.05);
            case "good":
                return (int) Math.ceil(amount * 0.1);
            case "great":
                return (int) Math.ceil(amount * 0.15);
            case "excellent":
                return (int) Math.ceil(amount * 0.2);
            default:
                return null;
        }
    }
}
