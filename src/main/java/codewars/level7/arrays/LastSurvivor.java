package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.List;

public class LastSurvivor {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1};
        String res = lastSurvivor("abc", arr);
        System.out.println(res);
    }

    public static String lastSurvivor(String letters, int[] coords) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            list.add(letters.charAt(i));
        }
        for (int i = 0; i < coords.length; i++) {
            list.remove(coords[i]);
        }
        String res = list.get(0).toString();
        return res;
    }

    public static String lastSurvivor1(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);
        for (int i : coords) {
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}
