package codewars.level8.math;

public class Quadrants {

    public static void main(String[] args) {
        System.out.println(quadrant(1,1));
        System.out.println(quadrant(-10, 100));
        System.out.println(quadrant(-1, -9));
        System.out.println(quadrant(19, - 56));
    }

    public static int quadrant(int x, int y) {
        return x > 0 & y > 0 ? 1 : x < 0 & y > 0 ? 2 : x < 0 & y < 0 ? 3 : 4;
    }
}
