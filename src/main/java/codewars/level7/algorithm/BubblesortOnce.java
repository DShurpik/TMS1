package codewars.level7.algorithm;

public class BubblesortOnce {
    public static void main(String[] args) {
        int[] arr = bubbleSortOnce(new int[]{9, 7, 5, 3, 1, 2, 4, 6, 8});
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static int[] bubbleSortOnce(int[] array) {
        int[] resultArr = array.clone();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < resultArr.length - 1; j++) {
                if (resultArr[j] > resultArr[j + 1]) {
                    int temp = resultArr[j + 1];
                    resultArr[j + 1] = resultArr[j];
                    resultArr[j] = temp;
                }
            }
        }
        return resultArr;
    }


}
