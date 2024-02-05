package codewars.level8.array;

public class IndexOfAnElementInAnArray {
    public static void main(String[] args) {
        String[] array = {"2","3","5","7","11"};
        System.out.println(kata(array, "5")); // 2

    }

    public static String kata(String[] a, String s) {
        int i = java.util.Arrays.asList(a).indexOf(s);
        return i < 0 ? "Not found" : "" + i;
    }
}
