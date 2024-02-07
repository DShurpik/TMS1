package codewars.level7.fundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMax {
    static int[] getMinMax(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] res = getMinMax(Arrays.asList(1, 2));
        System.out.println(Arrays.toString(res));
    }
}
