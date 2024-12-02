package codewars.level8.array;

public class SearchInArrIfMoreThanLength {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        int i = 13;
        int fff = i % arr.length;
        System.out.println(fff + " остаток; " + arr.length + " arr.length");
        int ffffff = (i-1) % arr.length;
        System.out.println(ffffff + " остаток; " + arr.length + " arr.length");
        int res = arr[(i - 1) % arr.length];
        System.out.println(res);
    }
}
