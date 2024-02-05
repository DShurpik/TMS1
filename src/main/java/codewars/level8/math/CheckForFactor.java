package codewars.level8.math;

public class CheckForFactor {
    public static void main(String[] args) {
        System.out.println(checkForFactor(63, 7));
        System.out.println(checkForFactor(24612, 3));
    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
