package codewars.level8.math;

public class Qub_volume {
    public static void main(String[] args) {
        int[] q1 = new int[]{2,3,5};
        int[] q2 = new int[]{4,5,10};
        System.out.println(findDifference(q1, q2));
    }
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int v1 = 1;
        int v2 = 1;
        for (int i = 0; i < firstCuboid.length; i++) {
            v1 = v1 * firstCuboid[i];
        }
        for (int i = 0; i < secondCuboid.length; i++) {
            v2 = v2 * secondCuboid[i];
        }
        return Math.abs(v1 - v2);
    }
}
