package codewars.level7.strings;

import java.util.*;
import java.util.regex.*;

public class BasicMath {

    public static void main(String[] args) {
        String str = "1plus2plus3plus4";
        System.out.println(calculate(str));

        String str1 = "460plus12minus959";
        System.out.println(calculate(str1));
    }

    public static String calculate(String str) {
        String[] parts = str.replace("minus", "plus-").split("plus");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return String.valueOf(sum);
    }

    public static String calculate1(String str) {
        return "" + Arrays.stream(str.replace("minus", "plus-").split("plus"))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
