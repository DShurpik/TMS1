package codewars.level7.arrays;

import java.util.Arrays;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int[] res = evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
        System.out.println(Arrays.toString(res)); // [4, 6, 8]
    }

    public static int[] evenNumbers(int[] arr, int n){
        int[] res = new int[n];
        int count = n;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                res[count - 1] = arr[i];
                count--;
            }
            if (count == 0) break;
        }
        return res;
    }
}
