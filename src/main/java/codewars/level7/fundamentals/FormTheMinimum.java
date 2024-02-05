package codewars.level7.fundamentals;
// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class FormTheMinimum {
    public static void main(String[] args) {
        System.out.println(minValue(new int[] {1,3,1})); // 13
        System.out.println(minValue(new int[] {5, 7, 9, 5, 7})); // 579
        System.out.println(minValue(new int[] {4, 7, 5, 7})); // 457
        System.out.println(minValue1(new int[] {4, 7, 5, 7})); // 457
    }

    public static int minValue(int[] values){
        int[] arr = Arrays.stream(values).distinct().sorted().toArray();
        StringBuilder str = new StringBuilder();
        for (int i : arr) {
            str.append(i);
        }
        return Integer.parseInt(str.toString());
    }

    public static int minValue1(int[] values){
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.parseInt(s);
    }
}
