package codewars.level7.strings;

import java.util.Arrays;

public class WordValues {
    public static int [] nameValue(String [] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) != ' ') {
                    sum = sum + arr[i].charAt(j) - 'a' + 1;
                }
            }
            result[i] = sum * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"});
        int[] result1 = nameValue(new String[]{"abc","abc abc"});
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }
}
