package codewars.level7.algorithm;

public class AreaOfCircle {

    public static void main(String[] args) {
        double res = area(68);
        double res1 = area(43.2673);
        double res2 = area(0);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static double area(double radius) {
        double res = Math.round(radius * radius * Math.PI * 1000.0) / 1000.0;
        if (radius <= 0) {
            throw new IllegalArgumentException();
        } else {
            return res;
        }
    }
}
