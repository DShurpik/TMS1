package tms.lesson4;

public class LessonFourOneMethod {
    //Поиск максимума в двумерном массиве(матрице или таблице)
    public static void main(String[] args) {
        maximumOfMatrix();
    }

    private static void maximumOfMatrix(){
        int[][] arrNew = new int[][]{{20, 12, 35, 88},{23, 55, 33, 85},{10, -51, 0, -12}};

        int maxArrNew = arrNew[0][0];

        for (int i = 0; i < arrNew.length; i++) {
            int maxValue = arrNew[i][0];
            for (int j = 1; j < arrNew[i].length; j++) {
                if (arrNew[i][j] > maxValue)
                    maxValue = arrNew[i][j];
            }
            System.out.println("Максимум: " + maxValue);

            if (maxValue > maxArrNew) {
                maxArrNew = maxValue;
            }
        }
        System.out.println(maxArrNew);
    }
}
