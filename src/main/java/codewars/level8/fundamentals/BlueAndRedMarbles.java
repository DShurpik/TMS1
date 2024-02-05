package codewars.level8.fundamentals;

public class BlueAndRedMarbles {
    public static void main(String[] args) {
        System.out.println(guessBlue(5, 7, 4, 3));
    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        int blueRem = blueStart - bluePulled;
        int redRem = redStart - redPulled;
        return (double) blueRem / (blueRem + redRem);

    }
}
