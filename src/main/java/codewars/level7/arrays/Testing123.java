package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
public class Testing123 {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c"))); // "1: a", "2: b", "3: c"
        System.out.println(number(Arrays.asList("", "", "", "", ""))); // "1: ", "2: ", "3: ", "4: ", "5: "
    }

    public static List<String> number(List<String> lines) {
        List<String> listResult = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            listResult.add((i + 1) + ": " + lines.get(i));
        }
        return listResult;
    }
}
