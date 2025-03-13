package codewars.level7.strings;

import java.util.Arrays;

public class SortLastChar {
    public static void main(String[] args) {
        String[] result = last("take bintang and a dance please");
        // new String[]{"a", "and", "take", "dance", "please", "bintang"}
        System.out.println(Arrays.toString(result));
    }

    public static String[] last(String x) {
        String[] array = x.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].charAt(array[j].length() - 1) > array[j + 1].charAt(array[j + 1].length() - 1)) {
                    String temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

