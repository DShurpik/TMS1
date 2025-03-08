package codewars.level7.fundamentals;

import java.util.Arrays;

public class FindVowels {
    public static void main(String[] args) {
        int[] res = vowelIndices("supercalifragilisticexpialidocious");
        // [2, 4, 7, 9, 12, 14, 16, 19, 21, 24, 25, 27, 29, 31, 32, 33]
        System.out.println(Arrays.toString(res));
    }

    public static int[] vowelIndices(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ("AEIOUaeiou".contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }
        int[] result = new int[count];
        int resCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if ("AEIOUaeiou".contains(String.valueOf(word.charAt(i)))) {
                result[resCount] = i + 1;
                resCount++;
            }
        }
        return result;
    }
}
