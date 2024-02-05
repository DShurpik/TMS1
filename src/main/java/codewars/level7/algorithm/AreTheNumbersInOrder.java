package codewars.level7.algorithm;
// https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java

public class AreTheNumbersInOrder {
    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969})); // false
        System.out.println(isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058})); // true
    }

    public static boolean isAscOrder(int[] arr) {
        boolean isOrder = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isOrder = false;
                break;
            }
        }
        return isOrder;
    }
}
