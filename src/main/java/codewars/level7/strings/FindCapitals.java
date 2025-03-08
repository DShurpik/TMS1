package codewars.level7.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCapitals {
    public static void main(String[] args) {
        int[] arr = capitals("CodEWaRs");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] capitals(String s) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Integer.valueOf(s.charAt(i)) >= 65 && Integer.valueOf(s.charAt(i)) <= 90) {
                res.add(i);
            }
        }
        int[] array = new int[res.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = res.get(i);
        }
        return array;
    }
}
