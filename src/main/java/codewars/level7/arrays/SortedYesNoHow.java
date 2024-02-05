package codewars.level7.arrays;
// https://www.codewars.com/kata/580a4734d6df748060000045/train/java

public class SortedYesNoHow {
    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[] {1, 2})); // yes, ascending
        System.out.println(isSortedAndHow(new int[] {15, 7, 3, -8})); // yes, descending
        System.out.println(isSortedAndHow(new int[] {4, 2, 30})); // no
    }

    public static String isSortedAndHow(int[] array) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < array.length - 1; i++) {
           if (array[i] > array[i + 1]) {
               ascending = false;
           } else {
               descending = false;
           }
        }
        if (ascending) {
            return "yes, ascending";
        } else if (descending) {
            return "yes, descending";
        } else {
            return "no";
        }
    }
}
