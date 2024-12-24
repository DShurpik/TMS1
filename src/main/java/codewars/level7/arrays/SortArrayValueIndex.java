package codewars.level7.arrays;

public class SortArrayValueIndex {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 26, 2, 3, 4, 5 };

        int[] res = sortByValueAndIndex(arr1);
        for (int i : res) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        int[] arr2 = new int[] { 9, 5, 1, 4, 3 }; // 1, 9, 5, 3, 4 (((9, 10, 3, 16, 15)))
        int[] res1 = sortByValueAndIndex(arr2);
        for (int i : res1) {
            System.out.print(i + ", ");
        }
    }

    public static int[] sortByValueAndIndex(int[] array) {
        return new int[0];
    }
}
