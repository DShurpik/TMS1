package codewars.level7.strings;

import java.util.Arrays;
import java.util.List;

public class AllInclusive {

    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.length() == 0) return true;
        for (int i = 0; i < strng.length(); i++) {
            boolean res = false;
            for (String s : arr) {
                if (s.equals(strng)) {
                    res = true;
                    break;
                }
            }
            if (!res) {
                return false;
            }
            strng = strng.substring(1) + strng.charAt(0);
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        boolean result = containAllRots("XjYABhR", a);
        System.out.println(result);

        List<String> b = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        boolean result1 = containAllRots("bsjq", b);
        System.out.println(result1);
    }
}
