package codewars.level7.fundamentals;

import java.util.Arrays;

public class BasicSequencePractice {
    public static int[] sumOfN(int n) {
        int sum = 0;
        int[] res = new int[Math.abs(n) + 1];
        for (int i = 0; i < res.length; i++) {
            if (n > 0) {
                sum = sum + i;
                res[i] = sum;
            } else {
                sum = sum + i;
                res[i] = sum * -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = sumOfN(-5);
        System.out.println(Arrays.toString(result));
    }
}
