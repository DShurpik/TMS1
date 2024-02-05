package codewars.level7.fundamentals;

public class ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseLetter("krishan")); // "nahsirk"
        System.out.println(reverseLetter("ultr53o?n")); // "nortlu"
        System.out.println(reverseLetter("ab23c")); // "cba"
        System.out.println("--------");
        System.out.println(reverseLetter1("krishan")); // "nahsirk"
        System.out.println(reverseLetter1("ultr53o?n")); // "nortlu"
        System.out.println(reverseLetter1("ab23c")); // "cba"
    }

    public static String reverseLetter(final String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverseLetter1(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
