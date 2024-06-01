package codewars.level7.fundamentals;

import java.util.*;

public class Bingo {
    public static String bingo(int[] numberArray){
        Set<Integer> bingoNumbers = new HashSet<>(Arrays.asList(2, 9, 14, 7, 15));

        for (int i : numberArray) {
            if (bingoNumbers.contains(i)) {
                bingoNumbers.remove(i);
                if (bingoNumbers.isEmpty()) {
                    return "WIN";
                }
            }
        }
        return "LOSE";
    }


    public static void main(String[] args) {
        System.out.println(bingo(new int[]{21,13,2,7,5,14,7,15,9,10}));
        System.out.println(bingo(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
