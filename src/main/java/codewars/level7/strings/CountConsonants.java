package codewars.level7.strings;

public class CountConsonants {

    public static void main(String[] args) {
        System.out.println(getCount("helLo world"));    // 7
        System.out.println(getCount("XaeiouX"));        // 2
        System.out.println(getCount("012345_Cb"));      // 2
    }

    public static int getCount(String str) {
        return str.replaceAll("[aeiouAEIOU \\p{Punct}\\p{S}\\d_\\n]", "")
                .length();
    }

    public static int getCount1(String str) {
        return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();
    }
}
