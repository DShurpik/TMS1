package codewars.level7.arrays;

public class StantonMeasure {
    public static int stantonMeasure(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count1++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == count1) count2++;
        }
        return count2;
    }

    public static void main(String[] args) {
        int i = stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2});
        System.out.println(i);
        int j = stantonMeasure(new int[] {1, 4, 1, 2, 11, 2, 3, 1});
        System.out.println(j);
    }
}
