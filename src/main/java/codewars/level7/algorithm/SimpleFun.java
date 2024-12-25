package codewars.level7.algorithm;

public class SimpleFun {
    public static void main(String[] args) {
        System.out.println(houseNumbersSum(new int[]{4, 1, 2, 3, 0, 10, 2})); // 10
    }

    public static int houseNumbersSum(final int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j != 0) {
                sum += j;
            } else break;
        }
        return sum;
    }
}
