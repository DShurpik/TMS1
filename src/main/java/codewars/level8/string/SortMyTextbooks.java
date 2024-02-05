package codewars.level8.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMyTextbooks {
    //https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java
    public static void main(String[] args) {
        System.out.println();
    }

    public static List<String> sort(List<String> textbooks) {
        Comparator<String> caseSensitiveComparator = Comparator.naturalOrder();
        Collections.sort(textbooks, caseSensitiveComparator);
        return textbooks;
    }
}
