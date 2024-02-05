package codewars.level8.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEvenNumbers {

    public static void main(String[] args) {
        System.out.println(filterOddNumber(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 )));
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        int count = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 != 0) {
                list.add(listOfNumbers.get(i));
            }
        }
        return list;
    }
}
