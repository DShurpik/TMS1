package codewars.level8.Lists;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class LarioMuigiPipeProblem {
    public static void main(String[] args) {
        int[] arr = pipeFix1(new int[] {-1,5}); // 1,2,3,4,5,6,7,8,9,10,11,12
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] pipeFix(int[] numbers) {
        int start = numbers[0];
        int finish = numbers[numbers.length - 1];
        int arrLenght = finish - start;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= arrLenght; i++) {
            list.add(start++);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i ++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[] pipeFix1(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
