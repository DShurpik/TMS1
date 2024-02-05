package codewars.level8.fundamentals;

public class NoZerosForHeros {

    public static void main(String[] args) {
        System.out.println(noBoringZeros(96000));
    }

    public static int noBoringZeros(int n) {
        if (n == 0) {
            return 0;
        }
        int k = 0;
        while (n % 10 == 0) {
            n = n / 10;
            k++;
        }
        return n;
    }
}
