package codewars.level7.lists;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b"))); // (1, 2)
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                result.add(o);
            }
        }
        return result;
    }

    public static List<Object> filterList1(final List<Object> list) {

        return list.stream()
                .filter(obj -> obj.getClass().equals(Integer.class))
                .collect(toList());
    }
}
