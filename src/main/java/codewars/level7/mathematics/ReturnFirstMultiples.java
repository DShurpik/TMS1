package codewars.level7.mathematics;

import java.util.Arrays;

public class ReturnFirstMultiples {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + n;
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = multiples(3, 5);
        System.out.println(Arrays.toString(result)); // {5, 10, 15}
    }
}
