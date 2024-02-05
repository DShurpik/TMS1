package codewars.level7.strings;

public class aaSDAF {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 12; i++) {
            System.out.println(binary(arr, i));
        }
    }

    static String binary(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return "Key " + key + " was found on index " + middle;
            }
            if (arr[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return "Key " + key + " wasn't found";
    }
}
