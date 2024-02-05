package codewars.level7.algorithm;
// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class BeginnerSeriesSumOfNumbers {
    public static void main(String[] args) {
        System.out.println(GetSum(-1, 2)); // 2
        System.out.println(GetSum(-1, 0)); // -1
        System.out.println(GetSum(1, 2)); // 3
        System.out.println(GetSum(0, -1)); // -1
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (b < a) {
           for (int i = b; i <= a; i++) {
               sum = sum + i;
           }
        } else {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
