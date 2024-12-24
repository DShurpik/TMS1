package codewars.level7.strings;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 12; i++) {
            System.out.println(binary(arr, i));
        }
    }

    public static String binary(int[] arr, int i) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == i) {
                return "Key " + i + " was found on index " + middle;
            }
            if (arr[middle] < i) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return "Key " + i + " wasn't found";
    }
}
