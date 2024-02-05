package codewars.level7.mathematics;
// https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java

public class FindTheNextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121)); // 144
        System.out.println(findNextSquare(625)); // 676
        System.out.println(findNextSquare(114)); // -1
    }

    public static long findNextSquare(long sq) {
        if ((long)Math.sqrt(sq) * (int)Math.sqrt(sq) != sq) {
            return -1;
        }
        long i = (long) Math.sqrt(sq) + 1;
        return i * i;
    }
}
