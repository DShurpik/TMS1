package codewars.level7.fundamentals;
// https://www.codewars.com/kata/602db3215c22df000e8544f0/train/java
public class TwoNumbersArePositive {
    public static void main(String[] args) {
        System.out.println(twoArePositive(2, 4, -3)); // true
        System.out.println(twoArePositive(4, 6, 0)); // true
        System.out.println(twoArePositive(4, 6, 10)); // false
        System.out.println(twoArePositive(-4, 6, 0)); // false
    }

    public static boolean twoArePositive(int a, int b, int c) {
        int count = 0;
        int[] arr = new int[]{a, b, c};
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count == 2;
    }
}
