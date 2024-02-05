package codewars.level7.mathematics;
// https://www.codewars.com/kata/56484848ba95170a8000004d/train/java

public class SpeedControl {
    public static void main(String[] args) {
        System.out.println(gps(20, new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61})); // 41
    }

    public static int gps(int s, double[] x) {
        int gps = 0;
        int temp = 0;
        for (int i = 0; i < x.length - 1; i++) {
            temp = (int) ((3600 * (x[i + 1] - x[i])) / s);
            if (temp > gps) {
                gps = temp;
            }
        }
        return gps;
    }
}
