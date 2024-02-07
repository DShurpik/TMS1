package codewars.level7.fundamentals;

import java.util.Arrays;

public class LetterboxPaintSquad {
    public static int[] paintLetterboxes(final int start, final int end) {
        StringBuilder str = new StringBuilder();
        int[] result = new int[10];
        int[] arr = new int[end - start + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
            str.append(arr[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int digit = Character.getNumericValue(str.charAt(i));
                result[digit]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = paintLetterboxes(125, 132);
        System.out.println(Arrays.toString(res));
    }
}
