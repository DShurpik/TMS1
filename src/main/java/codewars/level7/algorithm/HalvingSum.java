package codewars.level7.algorithm;

public class HalvingSum {
    static int halvingSum(int n) {
        int sum = 0;
        int count = 1;
        while (n >= count) {
            sum = sum + n / count;
            count = count * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = halvingSum(25);
        int c = halvingSum(127);
        System.out.println(i);
        System.out.println(c);
    }
}
