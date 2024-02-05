package codewars.level8.math;

public class Cockroach {
    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
        System.out.println(cockroachSpeed(1.09));
    }
    public static int cockroachSpeed(double x){
        return (int) (x * 27.778);
    }
}
