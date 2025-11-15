package codewars.level7.strings;

import java.util.Arrays;

public class ScalingSquaredStrings {

    public static void main(String[] args) {
        System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    }

    public static String scale(String strng, int k, int v) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        String[] arr = strng.split("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                for (int f = 0; f < k; f++) {
                    stringBuilder1.append(arr[i].charAt(j));
                }
            }
            stringBuilder1.append(" ");
        }

        String[] arr2 = stringBuilder1.toString().split(" ");
        for (int i = 0 ; i < arr2.length; i++) {
            for (int j = 0; j < v; j++) {
                stringBuilder2.append(arr2[i]).append("\n");
            }
        }

        return stringBuilder2.toString().trim();
    }
}
