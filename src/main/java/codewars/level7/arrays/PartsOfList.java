package codewars.level7.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartsOfList {
    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][];
        List<List<String>> result1 = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i ++) {
            List<String> firstPart = new ArrayList<>();
            List<String> secondPart = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                firstPart.add(arr[j]);
            }

            for (int j = i + 1; j < arr.length; j++) {
                secondPart.add(arr[j]);
            }

            result1.add(List.of(String.join(" ", firstPart), String.join(" ", secondPart)));
            result[i] = new String[]{String.join(" ", firstPart), String.join(" ", secondPart)};
        }
        return result;
    }

    public static String[][] partlist1(String[] arr) {
        String[][] returnArray = new String[arr.length-1][2];
        for(int i = 0; i < arr.length-1; ++i) {
            returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
            returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i+1, arr.length));
        }

        return returnArray;
    }

    public static void main(String[] args) {
        String[][] result = partlist1(new String[] {"a", "b", "c", "d", "e"});
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
            }
        }
    }