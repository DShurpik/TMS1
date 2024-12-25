package codewars.level7.algorithm;

public class ATM {
    public static void main(String[] args) {
        System.out.println(solve(770)); // 4
    }

    public static int solve(int n) {
        if (n % 10 != 0) return -1;
        int count = 0;
        for (int i: new int[]{500, 200, 100, 50, 20, 10}) {
            count += n / i;
            n %= i;
        }
        return count;
    }

    public static int solve1(int n) {
        if (n % 10 != 0) return -1;
        int count = 0;
        int sum = n;
        while (sum > 0) {
            if (sum >= 500) {
                count += sum / 500;
                sum %= 500;
            } else if (sum >= 200) {
                count += sum / 200;
                sum %= 200;
            } else if (sum >= 100) {
                count += sum / 100;
                sum %= 100;
            } else if (sum >= 50) {
                count += sum / 50;
                sum %= 50;
            } else if (sum >= 20) {
                count += sum / 20;
                sum %= 20;
            } else if (sum >= 10) {
                count += sum / 10;
                sum %= 10;
            }
        }
        return count;
    }
}
