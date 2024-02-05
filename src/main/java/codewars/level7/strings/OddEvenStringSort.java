package codewars.level7.strings;
// https://www.codewars.com/kata/580755730b5a77650500010c/train/java

public class OddEvenStringSort {
    public static void main(String[] args) {
        System.out.println(sortMyString("CodeWars")); // Cdwr oeas
    }

    public static String sortMyString(String s) {
        char[] arr = s.toCharArray();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                str1.append(arr[i]);
            } else {
                str2.append(arr[i]);
            }
        }
        return str1.toString() + " " + str2.toString();
    }
}
