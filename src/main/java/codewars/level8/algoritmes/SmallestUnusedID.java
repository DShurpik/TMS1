package codewars.level8.algoritmes;

import java.util.Arrays;

public class SmallestUnusedID {
    public static void main(String[] args) {
        System.out.println(nextId(new int[] { 0, 1, 2, 3, 5 })); // 4
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3, 5 })); // 4
        System.out.println(nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })); // 11
    }

    public static int nextId(int[] ids) {
        Arrays.sort(ids);
        int id = 0;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id) {
                id++;
            }
        }
        return id;
    }
}
