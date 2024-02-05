package codewars.level8.fundamentals;

public class AgeRangeCompatibilityEquation {
    public static void main(String[] args) {
        System.out.println(datingRange(17)); // "15-20"
        System.out.println(datingRange(40)); // "27-66"
        System.out.println(datingRange(10)); // 9-11
    }


    public static String datingRange(int age) {
        if (age <= 14) {
            double minD = age - 0.10 * age;
            double maxD = age + 0.10 * age;
            return (int)minD + "-" + (int)maxD;
        }
        int min = (age / 2) + 7;
        int max = (age - 7) * 2;
        return min + "-" + max;
    }

    public static String datingRange1(int age) {
        return age <= 14 ? (age - 0.10 * age) + "-" + (age + 0.10 * age) : (age / 2) + 7 + "-" + (age - 7) * 2;
    }
}
