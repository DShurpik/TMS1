package codewars.level8.fundamentals;

public class IsHeGonnaSurvive {
    public static void main(String[] args) {
        System.out.println(hero(10, 5)); // true
        System.out.println(hero(4, 5)); // false
    }

    public static boolean hero(int bullets, int dragons) {
        return bullets >= dragons * 2;
    }
}
