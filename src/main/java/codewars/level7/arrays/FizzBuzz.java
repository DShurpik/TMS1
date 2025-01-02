package codewars.level7.arrays;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(15)));
    }

    public static String[] fizzBuzz(int n) {
        if (n <= 1) return new String[]{"1"};
        String[] res = new String[n - 1];
        int count = 1;
        for (int i = 0; i < res.length; i++) {
            if (count % 3 == 0 && count % 5 == 0) {
                res[i] = "FizzBuzz";
            } else if (count % 5 == 0) {
                res[i] = "Buzz";
            } else if (count % 3 == 0) {
                res[i] = "Fizz";
            } else {
                res[i] = Integer.toString(count);
            }
            count++;
        }
        return res;
    }
}
