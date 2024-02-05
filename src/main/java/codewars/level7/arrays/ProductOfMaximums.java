package codewars.level7.arrays;

import java.util.Arrays;

public class ProductOfMaximums {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long sum = 1;
        int count = 0;
        int index = numbers.length - 1;
        while (count < sub_size) {
            sum = numbers[index] * sum;
            index--;
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        long i = maxProduct(new int[]{4,3,5}, 2);
        long j = maxProduct(new int[]{8,6,4,6}, 3);
        System.out.println(i); // 20
        System.out.println(j); // 288
    }
}
