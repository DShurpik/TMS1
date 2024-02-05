package codewars.level7.arrays;
// https://www.codewars.com/kata/5a4138acf28b82aa43000117/train/java
public class MaximumProduct {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921})); // -14
        System.out.println(adjacentElementsProduct(new int[] {4, 12, 3, 1, 5})); // 48
        System.out.println(adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000})); // 0
    }

    public static int adjacentElementsProduct(int[] array) {
        int adj = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > adj) {
                adj = array[i] * array[i + 1];
            }
        }
        return adj;
    }
}
