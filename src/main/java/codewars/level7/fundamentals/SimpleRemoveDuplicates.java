package codewars.level7.fundamentals;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/5ba38ba180824a86850000f7/train/java
public class SimpleRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = solve(new int[]{1,1,4,5,1,2,1}); // 4,5,2,1
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int [] solve(int [] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            if (!list.contains(currentElement)) {
                list.add(0, currentElement);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

