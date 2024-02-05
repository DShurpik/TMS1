package codewars.level7.arrays;
// https://www.codewars.com/kata/595aa94353e43a8746000120/train/java

public class LostNumberInNumberSequence {
    public static void main(String[] args) {
        System.out.println(findDeletedNumber(new int[]{1,2,3,4,5}, new int[]{3,4,1,5})); // 2
        System.out.println(findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8})); // 5
        System.out.println(findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3})); // 0

        System.out.println(findDeletedNumber1(new int[]{1,2,3,4,5}, new int[]{3,4,1,5})); // 2
        System.out.println(findDeletedNumber1(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8})); // 5
        System.out.println(findDeletedNumber1(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3})); // 0
    }

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = true;
            for (int j = 0; j < mixedArr.length; j++) {
                if (arr[i] == mixedArr[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return arr[i];
            }
        }
        return 0;
    }

    public static int findDeletedNumber1(int[] arr, int[] mixedArr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        for (int j = 0; j < mixedArr.length; j++) {
            sum2 = sum2 + mixedArr[j];
        }
        return Math.abs(sum2 - sum1);
    }
}
