package codewars.level7.strings;

public class ShorterConcat {
    public static String shorterReverseLonger(String a, String b) {
        if (a.length() > b.length()) {
            StringBuilder str = new StringBuilder(a);
            return b + str.reverse() + b;
        } else if (a.length() == b.length()) {
            StringBuilder str = new StringBuilder(a);
            return b + str.reverse() + b;
        } else {
            StringBuilder str = new StringBuilder(b);
            return a + str.reverse() + a;
        }
    }

    public static String shorterReverseLonger1(String a, String b) {
        return a.length() >= b.length() ?
                b + new StringBuilder(a).reverse() + b :
                a + new StringBuilder(b).reverse() + a;
    }

    public static void main(String[] args) {
        System.out.println(shorterReverseLonger("hello", "bau"));
        System.out.println(shorterReverseLonger("first", "abcde"));
    }
}
