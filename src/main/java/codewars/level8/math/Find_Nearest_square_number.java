package codewars.level8.math;
/** Найти число, корень которого близок к какому целому числу*/

public class Find_Nearest_square_number {
    public static void main(String[] args) {
        System.out.println(nearestSq(111)); //121
        System.out.println(nearestSq(10));//9
        System.out.println(nearestSq(2));//1
    }

    public static int nearestSq(final int n){
        double n2 = Math.sqrt(n);
        int n3 = (int) Math.round(n2);
        return n3 * n3;
    }
}
