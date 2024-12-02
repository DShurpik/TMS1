package codewars.level8.array;

public class NThPower {
    public static void main(String[] args) {
        System.out.println(nthPower(new int[] {3,1,2,2}, 3)); // 8
        System.out.println(nthPower(new int[] {3,1,2}, 2)); // 4
        System.out.println(nthPower(new int[] {1,2}, 2)); // -1

    }

    public static int nthPower(int[] array, int n) {
        return n < array.length ? (int) Math.pow(array[n], n) : -1;
    }
}
