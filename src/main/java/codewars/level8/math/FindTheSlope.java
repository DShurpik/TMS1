package codewars.level8.math;

public class FindTheSlope {
    public static void main(String[] args) {
        System.out.println(slope(new int[]{10,50,30,150})); // 5

        System.out.println(slope(new int[] {19,3,20,3})); // 0

        System.out.println(slope(new int[]{-10,6,-10,3})); // undefined
    }

    public static String slope(int[] points) {
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        int y = y2 - y1;
        int x = x2 - x1;

        if (x == 0) {
            return "undefined";
        } else {
            return Integer.toString(y / x);
        }
    }
}
