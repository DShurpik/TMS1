package codewars.level7.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MyLanguageSkills {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> result = new ArrayList<>();

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(results.entrySet());
        sortedEntries.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() >= 60) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static List<String> myLanguages1(final Map<String, Integer> results) {
        return results.entrySet()
                .stream()
                .filter( me -> me.getValue() >= 60 )
                .sorted( (m1,m2) -> Integer.compare(m2.getValue(),m1.getValue()) )
                .map( me -> me.getKey() )
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);
        System.out.println(myLanguages(map3));
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        System.out.println(myLanguages(map1));
    }
}
