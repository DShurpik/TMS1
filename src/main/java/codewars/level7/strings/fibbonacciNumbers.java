package codewars.level7.strings;

import java.util.Arrays;

public class fibbonacciNumbers {
    public static void main(String[] args) {
        int number = 20;
        int[] arr = new int[number];
        int previous = 0;
        int current = 1;
        arr[0] = previous;
        arr[1] = current;
        for (int i = 2; i < number; i++) {
            arr[i] = current + previous;
            previous = current;
            current = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
