package codewars.level7.strings;
// https://www.codewars.com/kata/58daa7617332e59593000006/train/java

public class MostDigits {
    public static void main(String[] args) {
        System.out.println(findLongest(new int[] {1, 10, 100})); // 100
        System.out.println(findLongest(new int[] {8, 900, 500})); // 900
        System.out.println(findLongest(new int[] {1, 2, 3, 10})); // 10
        System.out.println(findLongest(new int[] {-10, 1, 0, 1, 10})); // -10
    }

    public static int findLongest(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
                index = i;
            }
        }
        return numbers[index];
    }

}

