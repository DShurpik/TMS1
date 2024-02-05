package codewars.level7.arrays;

import java.util.Arrays;

public class MaximumTripletSum {
    public static int maxTriSum (int[] numbers) {
        int count = 0;
        int[] resarray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (resarray[j] == currentElement) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                resarray[count++] = currentElement;
            }
        }
        int[] finalResultArray = new int[count];
        System.arraycopy(resarray, 0, finalResultArray, 0, count);
        Arrays.sort(finalResultArray);
        int sum = 0;
        for (int i = finalResultArray.length - 3; i < finalResultArray.length; i++) {
            sum += finalResultArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = maxTriSum(new int[]{3,2,6,8,2,3});
        //int j = maxTriSum(new int[]{2,1,8,0,6,4,8,6,2,4});
        System.out.println(i);
    }
}
