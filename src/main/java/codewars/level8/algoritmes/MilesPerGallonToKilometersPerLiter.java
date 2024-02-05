package codewars.level8.algoritmes;

public class MilesPerGallonToKilometersPerLiter {
    public static void main(String[] args) {
        System.out.println(mpgToKPM(10)); // 3.54f
        System.out.println(mpgToKPM(20)); // 7.08f
        System.out.println(mpgToKPM(30)); // 10.62f
    }


    public static float mpgToKPM(final float mpg) {
        float res = (mpg * 1.609344f) / 4.54609188f;
        return Math.round(res * 100) / 100f;
    }

}
