package codewars.level7.arrays;

public class SumOfOddCubedNumbers {
    public static int cubeOdd(int arr[]) {
        int[] res = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) Math.pow(arr[i], 3);
            if (res[i] % 2 != 0) {
                sum += res[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = cubeOdd(new int[] {1, 2, 3, 4});
        System.out.println(i); // 28
    }
}
