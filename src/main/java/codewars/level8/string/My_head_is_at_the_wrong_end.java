package codewars.level8.string;

public class My_head_is_at_the_wrong_end {
    public static void main(String[] args) {

    }
    public static String[] fixTheMeerkat(String[] arr) {
        String[] str = new String[arr.length];
        str[0] = arr[2];
        str[1] = arr[1];
        str[2] = arr[0];
        return str;
    }
}
