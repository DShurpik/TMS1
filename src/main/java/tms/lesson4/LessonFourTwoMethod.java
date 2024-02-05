package tms.lesson4;

public class LessonFourTwoMethod {

    public static void main(String[] args) {
        maximumOfRow();
    }

    private static void maximumOfRow(){
        int[][] arrNew = new int[][]{{20, 12, 35, 88},{23, 55, 33, 85},{10, -51, 0, -12}};

        int maxArrNew = arrNew[0][0];

        for (int i = 0; i < arrNew.length; i++) {
            int maxRow = maximumOfCol(arrNew[i]);
            if (maxRow > maxArrNew) {
                maxArrNew = maxRow;
            }
        }
        System.out.println(maxArrNew);
    }

    private static int maximumOfCol(int[] arrKup) {
        int maxValue = arrKup[0];

        for (int i = 1; i < arrKup.length; i++) {
            if (arrKup[i] > maxValue)
                maxValue = arrKup[i];
        }
        System.out.println("Максимум: " + maxValue);
        return maxValue;
    }

}
