package codewars.level7.arrays;

import java.util.Arrays;

public class LengthTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = firstValue;
            else arr[i] = secondValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = alternate(20, "blue", "red");
        System.out.println(Arrays.toString(arr));
    }
}
