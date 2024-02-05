package codewars.level8.fundamentals;

public class Leonardo_Dicaprio_and_Oscars {

    public static void main(String[] args) {
        System.out.println(leo(88));
        System.out.println(leo(86));
        System.out.println(leo(87));
        System.out.println(leo(83));
        System.out.println(leo(89));
    }

    public static String leo(final int oscar) {
        return oscar == 88 ? "Leo finally won the oscar! Leo is happy" : oscar == 86 ? "Not even for Wolf of wallstreet?!"
                : oscar < 88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
    }

}
