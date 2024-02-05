package codewars.level7.fundamentals;
// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
public class SumOfTheFirstNthTermOfSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(15)); // "1.94"
        System.out.println(seriesSum(9)); // 1.77
        System.out.println(seriesSum(5)); // 1.57
    }

    public static String seriesSum(int n) {
        double count = 0.0;
        for (int i = 0; i < n; i++) {
            count = count + 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", count);
    }
}
