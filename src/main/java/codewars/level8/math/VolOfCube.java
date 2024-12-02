package codewars.level8.math;

public class VolOfCube {
    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));//63
    }
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
