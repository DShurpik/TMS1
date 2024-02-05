package codewars.level7.fundamentals;

// https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java

public class SimpleBeadsCount {
    public static void main(String[] args) {
        System.out.println(countRedBeads(4)); // 6
        System.out.println(countRedBeads(3)); // 4
        System.out.println(countRedBeads(2)); // 2
        System.out.println(countRedBeads(1)); // 0
        System.out.println(countRedBeads(0)); // 0
    }

    public static int countRedBeads(final int nBlue) {
        int count = 0;
        if (nBlue == 0 || nBlue == 1) return 0;
        else for (int i = 1; i < nBlue; i++) {
            count = count + 2;
        }
        return count;
    }

    public static int countRedBeads1(final int n) {
        return n < 2 ? 0 : 2*n - 2;
    }
}
