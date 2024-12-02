package codewars.level8.math;
/** https://www.codewars.com/kata/5601c5f6ba804403c7000004 */
public class LocalizeTheBarycenterOfATriangle {
    public static void main(String[] args) {

    }
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double x0, y0, x0_1, y0_1;
        double[] arr = new double[2];
        x0 = (x[0] + y[0] + z[0]) / 3;
        y0 = (x[1] + y[1] + z[1]) / 3;
        String resultX = String.format("%.4f", x0);
        String resultY = String.format("%.4f", y0);
        x0_1 = Double.parseDouble(resultX);
        y0_1 = Double.parseDouble(resultY);
        arr[0] = x0_1;
        arr[1] = y0_1;
        return arr;
    }
}
