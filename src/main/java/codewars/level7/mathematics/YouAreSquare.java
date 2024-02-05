package codewars.level7.mathematics;
//https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

public class YouAreSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(-1)); // false
        System.out.println(isSquare(0)); // true
        System.out.println(isSquare(24)); // false
        System.out.println(isSquare(25)); // true
    }

    public static boolean isSquare(int n) {
        return (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;
    }
}
