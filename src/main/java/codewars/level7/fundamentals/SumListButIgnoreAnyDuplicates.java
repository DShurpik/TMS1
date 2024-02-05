package codewars.level7.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2/train/java
public class SumListButIgnoreAnyDuplicates {
    public static void main(String[] args) {
        System.out.println(sumNoDuplicates(new int[]{1, 1, 2, 3})); // 5
        System.out.println(sumNoDuplicates(new int[]{1, 1, 2, 2, 3})); // 3
        System.out.println(sumNoDuplicates(new int[]{1, 2, 3})); // 6
        System.out.println(sumNoDuplicates(new int[]{1,3,5,5}));
        System.out.println(sumNoDuplicates(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 9,9}));
    }

    public static int sumNoDuplicates(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                i = -1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) {
                boolean isDublicate = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num && i != Arrays.binarySearch(arr, num)) {
                        isDublicate = true;
                        break;
                    }
                }
                if (!isDublicate) {
                    list.add(num);
                }
            }
        }
        return list.stream().mapToInt(Integer :: intValue).sum();
    }
}
