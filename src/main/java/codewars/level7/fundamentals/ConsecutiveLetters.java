package codewars.level7.fundamentals;

// https://www.codewars.com/kata/5ce6728c939bf80029988b57/train/java

import java.util.Arrays;

public class ConsecutiveLetters {
    public static void main(String[] args) {
        System.out.println(solve("abc")); // true
        System.out.println(solve("abd")); // false
        System.out.println(solve("dabc")); // true
        System.out.println(solve("abbc")); // false
        System.out.println(solve("v")); // true
    }

    public static boolean solve(String s){
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        boolean concecutive = false;
        int start = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (start == arr[i]) {
                start++;
                concecutive = true;
            } else {
                concecutive = false;
                break;
            }
        }
        return concecutive;
    }

    public static boolean solve1(String s){
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);

        boolean concecutive = false;
        int start = tempArray[0];
        for (int i = 0; i < tempArray.length; i++) {
            if (start == tempArray[i]) {
                start++;
                concecutive = true;
            } else {
                concecutive = false;
                break;
            }
        }
        return concecutive;
    }
}
