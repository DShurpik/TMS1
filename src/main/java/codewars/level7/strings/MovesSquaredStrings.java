package codewars.level7.strings;

public class MovesSquaredStrings {
    public static String vertMirror (String strng) {
        StringBuilder str = new StringBuilder();
        String[] arr = strng.split("\n");
        for (String s : arr) {
            str.append(new StringBuilder(s).reverse().append("\n"));
        }
        return str.toString().trim();
    }

    public static String horMirror (String strng) {
        StringBuilder str = new StringBuilder();
        String[] arr = strng.split("\n");
        for (int i = arr.length - 1; i >= 0; i--) {
            str.append(arr[i]).append("\n");
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        String result = vertMirror("abcd\nefgh\nijkl\nmnop");
        System.out.println(result);
        String result1 = horMirror("abcd\nefgh\nijkl\nmnop");
        System.out.println(result1);
    }
}
