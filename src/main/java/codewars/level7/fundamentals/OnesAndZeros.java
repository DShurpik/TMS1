package codewars.level7.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
public class OnesAndZeros {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < binary.size(); i++) {
            str.append(binary.get(i));
        }
        return Integer.parseInt(str.toString(), 2);
    }
}
