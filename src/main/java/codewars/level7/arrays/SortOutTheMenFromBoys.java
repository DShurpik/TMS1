package codewars.level7.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SortOutTheMenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        // create HashSet for deleting nonunique values
        HashSet<Integer> uniqueElements = new HashSet<>();
        int[] resultArray = new int[values.length];
        int index = 0;
        for (int num : values) {
            if (uniqueElements.add(num)) {
                resultArray[index++] = num;
            }
        }
        int odd = 0;
        int even = 0;
        int[] finalResultArray = new int[index];
        for (int i = 0; i < index; i++) {
            finalResultArray[i] = resultArray[i];
            if(resultArray[i] % 2 == 0) {
                odd++;
            } else {
                even++;
            }
        }
        int[] oddArr = new int[odd];
        int oddIndex = 0;
        int[] evenArr = new int[even];
        int evenIndex = 0;
        for (Integer i : finalResultArray) {
            if (i % 2 == 0) {
                oddArr[oddIndex] = i;
                oddIndex++;
            } else {
                evenArr[evenIndex] = i;
                evenIndex++;
            }
        }
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);
        for (int i = 0; i < evenArr.length - 1; i++) {
            for (int j = i + 1; j < evenArr.length; j++) {
                if (evenArr[i] < evenArr[j]) {
                    int temp = evenArr[i];
                    evenArr[i] = evenArr[j];
                    evenArr[j] = temp;
                }
            }
        }
        int[] resultArr = new int[oddArr.length + evenArr.length];
        System.arraycopy(oddArr, 0, resultArr, 0, oddArr.length);
        System.arraycopy(evenArr, 0, resultArr, oddArr.length, evenArr.length);
        return resultArr;
    }

    public static void main(String[] args) {
        int[] res = menFromBoys(new int[]{82,-61,-87,-12,21,1}); // {2,10,17,15,1}
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
