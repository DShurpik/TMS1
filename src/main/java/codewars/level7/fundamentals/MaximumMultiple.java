package codewars.level7.fundamentals;
// https://www.codewars.com/kata/5aba780a6a176b029800041c/train/java

public class MaximumMultiple {
    public static void main(String[] args) {
        System.out.println(maxMultiple(2, 7)); // 6
        System.out.println(maxMultiple(7, 17)); // 14
        System.out.println(maxMultiple(7, 100)); // 98
        System.out.println(maxMultiple1(7, 100)); // 98
    }

    public static int maxMultiple(int divisor, int bound) {
        int max = 0;
        for (int i = 0; i <= bound; i++) {
            if (i % divisor == 0) {
                max = i;
            }
        }
        return max;
    }

    public static int maxMultiple1(int divisor, int bound) {
        return bound - (bound % divisor);
    }
}
