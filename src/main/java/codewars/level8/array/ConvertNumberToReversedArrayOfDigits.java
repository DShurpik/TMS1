package codewars.level8.array;

public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
       int[] arr = digitize(35231);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }

    public static int[] digitize(long n) {
        String[] arr1 = String.valueOf(n).split("");
        int[] array = new int[arr1.length];
        int s = arr1.length - 1;
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(arr1[s]);
            s--;
        }
        return array;
    }
}
