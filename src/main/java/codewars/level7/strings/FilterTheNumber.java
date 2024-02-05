package codewars.level7.strings;

public class FilterTheNumber {
    public static long filterString(final String value) {
        String resultString = value.replaceAll("[a-zA-Z]", "");
        long i = Long.parseLong(resultString);
        return i;
    }

    public static void main(String[] args) {
        long i = filterString("aa1bb2cc3dd");
        System.out.println(i); // 123
    }
}
