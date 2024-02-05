package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/57f7796697d62fc93d0001b8/train/java
public class DoubleTrouble {
    public static void main(String[] args) {
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr = trouble(arr2, 3);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------");

        int[] arr3 = new int[] {2, 2, 2, 2, 2, 2};
        int[] arr4 = trouble(arr3, 4);
        for (Integer i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        int[] arr5 = new int[] {4, 1, 1, 1, 4};
        int[] arr6 = trouble(arr5, 2);
        for (Integer i : arr6) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        int[] arr7 = new int[] {1, 3, 5, 6, 7, 4, 3};
        int[] arr8 = trouble(arr7, 7);
        for (Integer i : arr8) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------");
        int[] arr9 = new int[] {2, 6, 2};
        int[] arr10 = trouble(arr9, 8);
        for (Integer i : arr10) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        int[] arr11 = new int[] {1, 1, 1, 1, 1, 1};
        int[] arr12 = trouble(arr11, 2);
        for (Integer i : arr12) {
            System.out.print(i + " ");
        }
    }

    public static int[] trouble(int[] x, int t) {
        List<Integer> result = new ArrayList<>();
        result.add(x[0]);
        for (int i = 1; i < x.length; i++) {
            if (x[i] + result.get(result.size() - 1) != t){
            result.add(x[i]);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

}
