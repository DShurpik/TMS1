package codewars.level7.algorithm;

public class ProductMainDiagonale {
    public static void main(String[] args) {
        int result = returnProduct(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,2}});
        System.out.println(result);
    }

    public static int returnProduct(int matrix[][]) {
        int res = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j == i; j++) {
                    res = res * matrix[i][j];
            }
        }
        return res; //your code here
    }
}
