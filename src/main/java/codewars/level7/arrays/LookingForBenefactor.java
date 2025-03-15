package codewars.level7.arrays;

import java.util.Arrays;

public class LookingForBenefactor {
    public static void main(String[] args) {
        System.out.println(newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90)); // 628
        System.out.println(newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 92)); // 645
    }

    public static long newAvg(double[] arr, double navg) {
        if (((long) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum()) <= 0)) {
            throw new IllegalArgumentException("Required donation must be positive.");
        }
        return (long) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
    }
}
