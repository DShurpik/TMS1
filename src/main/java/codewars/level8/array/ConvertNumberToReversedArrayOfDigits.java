package codewars.level8.array;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
       int[] arr = digitize(123456789);
       int[] arr1 = digitize1(123456789);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] digitize(long n) {
        String[] arr1 = String.valueOf(n).split("");
        int[] array = new int[arr1.length];
        int s = arr1.length - 1;
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(arr1[s]);
            s--;
        }
        return array;
    }

    public static int[] digitize1(long n) {
        String[] arr1 = String.valueOf(n).split("");
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            array[i] = Integer.parseInt(arr1[arr1.length - i - 1]);
        }
        return array;
    }
}
