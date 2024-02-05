package codewars.level8.math;

public class PointsReflection {
    public static void main(String[] args) {
        int[] arr = reflectPoint(new int[]{10, -10}, new int[]{-10, 10});
        System.out.println(arr[0] + " " + arr[1] + " arr");

        int[] arr1 = reflectPoint(new int[]{0,0}, new int[]{1,1});
        System.out.println(arr1[0] + " " + arr1[1] + " arr1");
    }

    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[] {2 * q[0] - p[0], 2 * q[1] - p[1]};
    }
}
