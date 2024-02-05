package codewars.level7.arrays;
// https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java

public class SmallEnough {
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] { 66, 101 }, 200)); // true
        System.out.println(smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100)); // false
        System.out.println(smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120)); // true
    }

    public static boolean smallEnough(int[] a, int limit) {
        boolean smallEnough = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                smallEnough = false;
                break;
            }
        }
        return smallEnough;
    }

    public static boolean smallEnough1(int[] a, int limit) {
        return java.util.Arrays.stream(a).noneMatch(i -> i>limit);
    }
}
