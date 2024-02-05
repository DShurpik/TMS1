package codewars.level8.array;

import static org.testng.Assert.assertEquals;

public class Square_n_Sum {
    public static void main(String[] args) {
        assertEquals(9, squareSum(new int[] {1,2,2}));
        assertEquals(5, squareSum(new int[] {1,2}));
        assertEquals(50, squareSum(new int[] {5,-3,4}));
        assertEquals(0, squareSum(new int[] {}));
    }
    public static int squareSum(int[] n) {
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum = sum + (int)(Math.pow(n[i], 2));
        }
        return sum;
    }
}
