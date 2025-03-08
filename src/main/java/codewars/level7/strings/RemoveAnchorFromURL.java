package codewars.level7.strings;

public class RemoveAnchorFromURL {
    public static void main(String[] args) {
        System.out.println(removeUrlAnchor("https://example.com#section1"));
    }

    public static String removeUrlAnchor(String url) {
        int index = 0;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '#') index = i;
        }
        if (index == 0) return url;
        else return url.substring(0, index);
    }
}
