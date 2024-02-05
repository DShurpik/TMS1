package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static List arrayLeaders(int[] numbers) {
        List result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
            }
            if (numbers[i] > sum) {
                result.add(numbers[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List list = arrayLeaders(new int[]{16,17,4,3,5,2}); // 17, 5, 2
        System.out.println(list);

        List list1 = arrayLeaders(new int[]{-36,-12,-27}); // -36,-12
        System.out.println(list1);
    }
}
