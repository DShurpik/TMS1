package codewars.level8.array;

import java.util.Arrays;

public class ReduceButGrow {

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3, 4}));
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
