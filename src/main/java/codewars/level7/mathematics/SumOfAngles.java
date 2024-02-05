package codewars.level7.mathematics;
// https://www.codewars.com/kata/5a03b3f6a1c9040084001765/train/java

public class SumOfAngles {
    public static void main(String[] args) {
        System.out.println(sumOfAngles(3)); // 180
        System.out.println(sumOfAngles(4)); // 360
    }

    public static int sumOfAngles(int n) {
        int sum = 180;
        for (int i = 3; i < n; i++ ) {
            sum = sum + 180;
        }
        return sum;
    }
}
