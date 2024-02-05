package codewars.level7.strings;

public class RunningOutOfSpace {
    public static void main(String[] args) {
        String[] arr = spacey(new String[]{"kevin", "has", "no", "space"});
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static String[] spacey(String[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }
}
