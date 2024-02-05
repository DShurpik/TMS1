package codewars.level8.algoritmes;

public class CollatzConjecture {
    public static int hotpo(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = hotpo(23);
        System.out.println(i);
    }
}
