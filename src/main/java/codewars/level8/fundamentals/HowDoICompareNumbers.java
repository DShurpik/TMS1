package codewars.level8.fundamentals;

public class HowDoICompareNumbers {

    public static void main(String[] args) {
        System.out.println(whatIs(42));
    }

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if ((int)p[0] == x)
                return (String)p[1];
        }
        return "everything squared";
    }

    static final Object[][] specialNumbers = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
