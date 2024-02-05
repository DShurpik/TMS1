package codewars.level8.Lists;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {

    public static void main(String[] args) {
        //System.out.println(removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));

        Object[] arr3 = removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        Object[] arr2 = removeEveryOther(new Object[]{1,2});
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static Object[] removeEveryOther1(Object[] arr) {
        Object[] res = new Object[(arr.length + 1) / 2];
        int index = 0;
        for (int i = 0; i < arr.length; i += 2) {
            res[index] = arr[i];
            index++;
        }
        return res;
    }

    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> arr1 = List.of(arr);
        List<Object> arrTotal = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i = i + 2) {
            arrTotal.add(arr1.get(i));
        }
        return arrTotal.toArray();
    }
}
