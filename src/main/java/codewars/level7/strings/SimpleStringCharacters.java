package codewars.level7.strings;

import java.util.Arrays;

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int uppercase = 0;
        int lowercase = 0;
        int numbers = 0;
        int special = 0;
        for(Character c : word.toCharArray()) {
            if(Character.isUpperCase(c)) uppercase++;
            else if(Character.isLowerCase(c)) lowercase++;
            else if(Character.isDigit(c)) numbers++;
            else special++;
        }
        return new int[]{uppercase, lowercase, numbers, special};

    }

    public static void main(String[] args) {
        int[] res = Solve("*'&ABCDabcde12345");
        System.out.println(Arrays.toString(res));
    }
}
