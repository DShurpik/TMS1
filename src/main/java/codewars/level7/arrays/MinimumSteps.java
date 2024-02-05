package codewars.level7.arrays;

import java.util.Arrays;

public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {
        int count = 0;
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (sum >= k) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = minimumSteps(new int[]{19,98,69,28,75,45,17,98,67}, 464); // 8
        System.out.println(result);
    }
}
