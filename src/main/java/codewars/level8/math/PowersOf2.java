package codewars.level8.math;

public class PowersOf2 {
    public static void main(String[] args) {
        long[] arr = new long[]{1,2,4,8,16};//4
        long[] arr1 = new long[]{1,2};//1
        long[] arr2 = powersOfTwo(4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        long[]arr3 = powersOfTwo(1);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    public static long[] powersOfTwo(int n){
        long[] arr = new long[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) Math.pow(2,i);
        }
        return arr;
    }
}
