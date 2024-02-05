package codewars.level7.strings;

public class NewSortArray {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 115, 98, 64, 32, 49, 97, 44, 22};

        int[] arr1 = minIndex(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static int[] minIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
