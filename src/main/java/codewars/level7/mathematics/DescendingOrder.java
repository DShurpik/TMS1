package codewars.level7.mathematics;
// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(15)); // 51
        System.out.println(sortDesc(0)); // 0
        System.out.println(sortDesc(123456789)); // 987654321
        System.out.println(sortDesc(345)); // 543
    }

    public static int sortDesc(final int num) {
        String str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arr) {
            stringBuilder.append(i);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
