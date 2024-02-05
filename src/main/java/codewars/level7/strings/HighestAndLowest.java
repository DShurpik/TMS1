package codewars.level7.strings;
// https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")); // "42 -9"
    }

    public static String highAndLow(String numbers) {
        String[] strArr = numbers.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (Integer i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return String.format(max + " " + min);
    }
}
