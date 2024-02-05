package codewars.level8.array;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class MergingSortedIntegerArrays {

    public static void main(String[] args) {

        int[] arr = mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr1 = mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 });
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }


    public static int[] mergeArrays(int[] first, int[] second) {
        int[] arr = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).sorted().toArray();
        int x = 0;
        for(int k = 0; k < arr.length; k++) {
            if(k == 0 || arr[k] != arr[k-1]) {
                arr[x++] = arr[k];
            }
        }
        return Arrays.copyOf(arr, x);
    }

    public static int[] mergeArrays1(int[] first, int[] second) {
        int[] arr = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).sorted().distinct().toArray();
        return arr;
    }

    public static int[] mergeArrays2(int[] first, int[] second) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int x : first) set.add(x);
        for (int x : second) set.add(x);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
