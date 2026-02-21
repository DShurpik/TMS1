package codewars.level7.fundamentals;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

import static java.util.stream.IntStream.of;

public class MultiplyAllElementsInArray {
    public static void main(String[] args) {
        int[] arr = Kata.multiplyAll(new int[] {1, 2, 3, 4}).apply(2);
        System.out.println(Arrays.toString(arr));
    }


}

class Kata{
    public static IntFunction <int[]> multiplyAll(int[] array) {
        return x -> {
            int[] result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] * x;
            }
            return result;
        };
    }

    static IntFunction<int[]> multiplyAll1(int[] array) {
        return n -> of(array).map(i -> n * i).toArray();
    }

    public static Function<Integer, int[]> multiplyAll2(int[] array ) {
        return n -> Arrays.stream( array ).map( x -> n*x ).toArray();
    }
}
