package codewars.level7.fundamentals;

public class DifferenceOfSquares {
    public static void main(String[] args) {
        System.out.println(differenceOfSquares(10)); // 2640
    }

    public static int differenceOfSquares(int n){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
            sum2 += (int) Math.pow(i, 2);
        }
        int sum3 = (int) Math.pow(sum1, 2) - sum2;
        return sum3;
    }
}
