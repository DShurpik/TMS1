package tms.lesson11.Task2Map;

import java.util.HashMap;
import java.util.Map;

public class SampleUseMap {
    public static void main(String[] args) {
        Map<Integer, String> mapByInt = new HashMap<>();
        mapByInt.put(1, "one");
        mapByInt.put(2,"two");
        mapByInt.put(3,"three");

        System.out.println(mapByInt.get(3));

        Map<String, Integer> mapByString = new HashMap<>();
        mapByString.put("one", 1);
        mapByString.put("two", 2);
        mapByString.put("three", 3);

        System.out.println(mapByString.get("three"));



    }
}
