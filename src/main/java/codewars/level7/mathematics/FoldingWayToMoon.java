package codewars.level7.mathematics;

public class FoldingWayToMoon {
    public static void main(String[] args) {
        System.out.println(fold(384000000.0)); // 42l
        System.out.println(fold(0.00005));
    }

    public static Long fold(Double distance) {
        if (distance < 0) return null;
        double temp = 0.0001;
        int count = 0;
        while (temp < distance) {
            temp *= 2;
            count++;
        }
        return (long) count;
    }
}
