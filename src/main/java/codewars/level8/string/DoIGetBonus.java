package codewars.level8.string;

public class DoIGetBonus {

    public static void main(String[] args) {
        System.out.println(bonusTime(10000, true));
        System.out.println(bonusTime(60000, false));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            return "\u00A3" + salary * 10;
        } else {
            return "\u00A3" + salary;
        }
    }

    public static String bonusTime1(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }
}
