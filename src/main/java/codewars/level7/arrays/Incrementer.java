package codewars.level7.arrays;

import java.util.Arrays;

public class Incrementer {
    public static int[] incrementer(int[] numbers) {
        int[] resultArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i] + i + 1;
            if (temp >= 10) {
                resultArr[i] = temp % 10;
            } else {
                resultArr[i] = temp;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = incrementer(new int[]{3, 6, 9, 8, 9});
        System.out.println(Arrays.toString(arr));
    }
}
