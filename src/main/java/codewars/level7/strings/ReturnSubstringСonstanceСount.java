package codewars.level7.strings;

public class ReturnSubstringСonstanceСount {

    public static void main(String[] args) {
        System.out.println(substringCount("abcdeb", "b"));  // 2
        System.out.println(substringCount("abcdeb", "a"));  // 1
        System.out.println(substringCount1("ccddeeccddeecc", "cc")); // 3
        System.out.println(substringCount1("aaabbbccc", "bb")); // 1
    }

    public static int substringCount(String fullText, String search) {
        int count = 0;
        int m = search.length();
        for (int i = 0; i <= fullText.length() - m; i++) {
            if (fullText.substring(i, i + m).equals(search)) {
                count++;
                i += m - 1;
            }
        }

        return count;
    }

    static int substringCount1(String fullText, String search) {
        return (fullText + "_").split(search).length - 1;
    }
}
