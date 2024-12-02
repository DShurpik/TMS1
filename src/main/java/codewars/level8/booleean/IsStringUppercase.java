package codewars.level8.booleean;

public class IsStringUppercase {
    public static void main(String[] args) {
        System.out.println(isUpperCase("hello I AM DONALD")); // false
        System.out.println(isUpperCase1("ACSKLDFJSGSKLDFJSKLDFJ")); // true
        System.out.println(isUpperCase("HELLO I AM DONALD")); // true
        System.out.println(isUpperCase("N,KTLW _~WO!U&9^^O[5,*J6D*L"));
    }

    public static boolean isUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && !Character.isUpperCase(s.charAt(i))) return false;
        }
        return true;
    }

    public static boolean isUpperCase1(String s) {
        return s.toUpperCase() == s;
    }
}
