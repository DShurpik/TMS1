package codewars.level7.mathematics;

public class AreaOfArrow {
    public static void main(String[] args) {
        System.out.println(arrowArea(4, 2)); // 2.0
        System.out.println(arrowArea(7, 6)); // 10.5
        System.out.println(arrowArea(25, 25)); // 156.25
        System.out.println(arrowArea(105, 100)); // 2625.0
        System.out.println(arrowArea(0, 0)); // 0.0
    }

    public static double arrowArea(int a, int b) {
        return (a > 0 && b > 0) ? a * b / 4d : 0.0;
    }
}
