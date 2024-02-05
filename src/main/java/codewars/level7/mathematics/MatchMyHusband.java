package codewars.level7.mathematics;

// https://www.codewars.com/kata/5750699bcac40b3ed80001ca/train/java

public class MatchMyHusband {
    public static void main(String[] args) {
        System.out.println(match(new int[]{15,24,12}, 4)); // "No match!"
        System.out.println(match(new int[]{26,23,19}, 3)); // "Match!"
        System.out.println(match(new int[]{11,25,36}, 1)); // "No match!"
        System.out.println(match(new int[]{22,9,24}, 5)); // "Match!"
    }

    public static String match(int[] usefulness, int months) {
        int sum = 0;
        for (Integer i : usefulness) {
            sum = sum + i;
        }
        double startValue = 100;
        for (int i = 0; i < months; i++) {
            startValue -= 0.15 * startValue;
        }
        return startValue > sum ? "No match!" : "Match!";
    }
}
