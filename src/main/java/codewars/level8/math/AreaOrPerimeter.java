package codewars.level8.math;

import org.testng.Assert;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        Assert.assertEquals(16, areaOrPerimeter(4 , 4));
        Assert.assertEquals(32, areaOrPerimeter(6 , 10));
    }
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : 2 * (l + w);
    }
}
