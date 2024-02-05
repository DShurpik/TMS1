package codewars.level7.strings;
// https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3/train/java

import java.util.Arrays;

public class SortTheGiftCode {
    public static void main(String[] args) {
        SortTheGiftCode sort = new SortTheGiftCode();
        System.out.println(sort.sortGiftCode1("zyxwvutsrqponmlkjihgfedcba")); // abcdefghijklmnopqrstuvwxyz
        System.out.println(sort.sortGiftCode1("fedcba")); // abcdef
    }

    public String sortGiftCode(String code){
        char[] arr = code.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public String sortGiftCode1(String code){
        char[] arr = code.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}
