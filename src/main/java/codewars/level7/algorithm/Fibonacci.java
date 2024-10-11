package codewars.level7.algorithm;

public class Fibonacci {
    public static void main(String[] args) {

        long i1 = fib(5);

        System.out.println(i1);
    }

    public static long fib (int n){
        if (n == 0) return 0;
        if (n > 0 && n < 3) return 1;
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 1];
    }

    public static long fib1 (int n) {
        if (n < 3) return 1;

        long first = 1;
        long second = 1;
        for (int i = 3; i <= n; i++) {
            second += first;
            first = second - first;
        }
        return second;
    }
}
