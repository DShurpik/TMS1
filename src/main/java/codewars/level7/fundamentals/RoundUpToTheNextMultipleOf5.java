package codewars.level7.fundamentals;
// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java

public class RoundUpToTheNextMultipleOf5 {
    public static void main(String[] args) {
        System.out.println(roundToNext5(12)); // 15
        System.out.println(roundToNext5(21)); // 25
        System.out.println(roundToNext5(-5)); // -5
        System.out.println(roundToNext5(-2)); // 0
        System.out.println(roundToNext5(-6));
        System.out.println(roundToNext5(-1509558)); // -1509555
    }

    public static int roundToNext5(int number) {
        if (number % 5 == 0) {
            return number;
        } else if (number > 0) {
            return ((number / 5) + 1) * 5;
        } else {
            return ((number / 5)) * 5;
        }
    }
}
