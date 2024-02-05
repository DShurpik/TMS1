package codewars.level8.array;

import java.util.Arrays;
import java.util.Collections;

public class GravityFlip {
    public static void main(String[] args) {
        int[] arr1 = flip('R', new int[]{ 3,2,1,2 });
        int[] arr2 = flip('L', new int[]{ 1,4,5,3,5 });
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            for (int i = 0; i < arr.length - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min_index]) {
                        min_index = j;
                    }
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[min_index]) {
                        min_index = j;
                    }
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] flip1(char dir, int[] arr) {

        if (dir == 'L') {
            arr = Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else{
            Arrays.sort(arr);
        }

        return arr;
    }
}
