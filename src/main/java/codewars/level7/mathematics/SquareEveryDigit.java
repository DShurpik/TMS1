package codewars.level7.mathematics;
// https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

import java.util.stream.Collectors;

public class SquareEveryDigit {
    public static void main(String[] args) {
        SquareEveryDigit squareEveryDigit = new SquareEveryDigit();
        System.out.println(squareEveryDigit.squareDigits(9119));
    }

    public int squareDigits(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i))) * Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public int squareDigits1(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
