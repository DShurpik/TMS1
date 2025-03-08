package codewars.level7.puzzle;

public class CircleOfNumbers {
    public static void main(String[] args) {
        System.out.println(circleOfNumbers(6, 3)); // 0
        System.out.println(circleOfNumbers(10, 7)); // 2
        System.out.println(circleOfNumbers(10, 2)); // 7
        System.out.println(circleOfNumbers(20, 0)); // 10

        System.out.println(circleOfNumbers1(6, 3)); // 0
        System.out.println(circleOfNumbers1(10, 7)); // 2
        System.out.println(circleOfNumbers1(10, 2)); // 7
        System.out.println(circleOfNumbers1(20, 0)); // 10
    }

    public static int circleOfNumbers(int n, int firstNumber) {
        int res;
        if (firstNumber > (n / 2)) {
            res = firstNumber - n / 2;
        } else res = firstNumber + n / 2;
        if (res == n) return 0;
        return res;
    }

    static int circleOfNumbers1(int n, int firstNumber) {
        return (n / 2 + firstNumber) % n;
    }
}
