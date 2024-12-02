package codewars.level8.math;

public class WillYouMakeIt {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
        System.out.println(zeroFuel(100, 50, 1));
    }
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        double total = mpg * fuelLeft;
        return distanceToPump > total ? false : true;
    }
}
