package codewars.level8.math;

import org.testng.Assert;

public class SumArrays {
    public static void main(String[] args) {
        Assert.assertEquals(0,      sum(new double[] { }),                1e-4);
        Assert.assertEquals(-2.398, sum(new double[] {-2.398}),           1e-4);
        Assert.assertEquals(6,      sum(new double[] {1, 2, 3}),          1e-4);
        Assert.assertEquals(6.6,    sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        Assert.assertEquals(9.2,    sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        Assert.assertEquals(320,    sum(new double[] {30, 89, 100, 101}), 1e-4);
    }
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }
}
