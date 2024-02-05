package codewars.level7.algorithm;
// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java

public class TriangularTreasure {
    public static void main(String[] args) {
        System.out.println(triangular(2)); // 3
        System.out.println(triangular(4)); // 10
        System.out.println(triangular(1275)); // 813450
        System.out.println(triangular(-1)); // 0
    }

    public static long triangular(long n) {
        if (n <=0) return 0;
        long result = (n * (n + 1)) / 2;
        return result;
    }
}
