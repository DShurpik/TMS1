package codewars.level7.fundamentals;

import java.util.Arrays;

public class ExtraPerfectNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extraPerfect(28)));
        System.out.println(Arrays.toString(extraPerfect(39)));
        System.out.println(Arrays.toString(extraPerfect(8)));
        System.out.println(Arrays.toString(extraPerfect(5)));
    }

    public static int[] extraPerfect(int number) {
        int len;
        if (number % 2 == 0) len = number / 2;
        else len = number / 2 + 1;
        int[] res = new int[len];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + i + 1;
        }
        return res;
    }
}
