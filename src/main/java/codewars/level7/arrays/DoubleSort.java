package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dbSort(new Object[]{"Apple",46,"287",574,"Peach","3","69",78,"Grape","423"})));
        System.out.println(Arrays.toString(dbSort1(new Object[]{"Apple",46,"287",574,"Peach","3","69",78,"Grape","423"})));
    }

    public static Object[] dbSort(Object[] a){
        List<Integer> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        for (Object o : a) {
           if (o instanceof Integer) digits.add(Integer.parseInt(o.toString()));
           else letters.add(o.toString());
        }
        digits = digits.stream().sorted().collect(Collectors.toList());
        letters = letters.stream().sorted().collect(Collectors.toList());
        List<Object> result = new ArrayList<>();
        result.addAll(digits);
        result.addAll(letters);
        return result.toArray();
    }

    public static Object[] dbSort1(Object[] a){
        return Stream.concat(
                Arrays.stream(a).filter((x)-> x instanceof Number).map((x)->(Number)x).sorted()
                ,Arrays.stream(a).filter((x)->x instanceof String).map((x)->(String)x).sorted()
        ).toArray();
    }
}
