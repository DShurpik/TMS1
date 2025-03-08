package codewars.level7.arrays;

public class SumOfMinimums {
    public static void main(String[] args) {
        System.out.println(sumOfMinimums(new int[][]{{11, 12, 14, 54}, {67, 89, 90, 56}, {7, 9, 4, 3}, {9, 8, 6, 7}}));
    }

    public static int sumOfMinimums(int[][] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) min = arr[i][j];
            }
            res += min;
        }
        return res;
    }
}
