package codewars.level7.arrays;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return Math.abs(max - min);
    }

    public static void main(String[] args) {
        int res = betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}); // 42
        int res1 = betweenExtremes(new int[]{-1, -41, -77, -100}); // 99
        System.out.println(res);
        System.out.println(res1);
    }
}
