package codewars.level7.arrays;
// https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java

public class MaxDiffEasy {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 })); // 4
        System.out.println(maxDiff(new int[]{ -4, -5, -3, -1, -31 })); // 30
    }

    public static int maxDiff(int[] lst) {
        if (lst.length == 1 || lst.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : lst) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max - min;
    }
}
