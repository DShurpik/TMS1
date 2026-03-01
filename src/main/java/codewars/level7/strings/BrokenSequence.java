package codewars.level7.strings;

import java.util.Arrays;

public class BrokenSequence {
    public static void main(String[] args) {
        System.out.println(findMissingNumber("1 2 3 4 5")); // 0
        System.out.println(findMissingNumber("1 2 3 4 5 6 7 8 9 10")); // 0
        System.out.println(findMissingNumber("1 2 3 4 5 6 7 8 9 10 12")); // 11
        System.out.println(findMissingNumber("2 1 4 3 a")); // 1

    }

    public static int findMissingNumber(String sequence) {
        int missing = 0;
        if (sequence.isEmpty()) return 0;
        char[] arr = sequence.toCharArray();
        for (char c : arr) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') return 1;
        }
        int[] numbers;
        try {
            numbers = Arrays.stream(sequence.split(" ")).mapToInt(Integer::parseInt).toArray();
        } catch (NumberFormatException e) {
            return 1;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i + 1) return i + 1;
        }
        return missing;
    }
}
