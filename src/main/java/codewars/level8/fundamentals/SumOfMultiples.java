package codewars.level8.fundamentals;

public class SumOfMultiples {

    public static void main(String[] args) {
        System.out.println(sumMul(2, 9)); // 20
        System.out.println(sumMul(5, 20)); // 30
        System.out.println(sumMul(4, 123)); // 1860
        System.out.println(sumMul(-1, -10));
    }


    public static long sumMul(int n, int m) {
        if(n <= 0 || m <= 0){
            throw new IllegalArgumentException("n = " + n + " m = " + m);
        }
        long sum = 0;
        for(int i = n; i < m; i++){
            if (i % n == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
