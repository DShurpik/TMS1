package codewars.level7.fundamentals;
// https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java

public class LargestPairSumInArray {
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10,14,2,23,19})); // 42
        System.out.println(largestPairSum(new int[]{-100,-29,-24,-19,19})); // 0
        System.out.println(largestPairSum(new int[]{1,2,3,4,6,-1,2})); // 10
        System.out.println(largestPairSum(new int[]{24, 60, -9, -19, -74, 97, 8, -6, 73, 55, -54, 66, -73, -51, 65, 29, 20, 17, -100, -25, -82, 70, 14, -40, -67, 51, -35, -89, 29, 24, 80, -69, 12, -65, 94}));
    }

    public static int largestPairSum(int[] numbers){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
