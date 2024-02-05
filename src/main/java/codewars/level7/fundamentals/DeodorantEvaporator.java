package codewars.level7.fundamentals;

public class DeodorantEvaporator {
    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 10)); // 22
    }

    public static int evaporator(double content, double evapPerDay, double threshold) {
        int days = 0;
        double remainingContent = 100.0;
        while (remainingContent > threshold) {
            remainingContent -= remainingContent * (evapPerDay / 100.0);
            days++;
        }
        return days;
    }
}
