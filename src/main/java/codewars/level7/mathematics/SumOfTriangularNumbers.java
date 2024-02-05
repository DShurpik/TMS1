package codewars.level7.mathematics;
//https://www.codewars.com/kata/580878d5d27b84b64c000b51/train/java

public class SumOfTriangularNumbers {
    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6)); // 56
        System.out.println(sumTriangularNumbers(943)); // 140205240
        System.out.println(sumTriangularNumbers(34)); // 7140
    }

    public static int sumTriangularNumbers(int n) {
        if (n < 0) return 0;
        return n * (n + 1) * (n + 2) / 6;
    }
}
