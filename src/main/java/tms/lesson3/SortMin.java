package tms.lesson3;

public class SortMin {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        sortMin(arr);

    }

    private static void sortMin(int[] arrMin) {
        for (int i = 0; i < arrMin.length; i++) {
            for (int j = 0; j < arrMin.length - 1; j++) {
                if (arrMin[j] > arrMin[j + 1]) {
                    int temp = arrMin[j + 1];
                    arrMin[j + 1] = arrMin[j];
                    arrMin[j] = temp;
                }
            }
        }
        for (int a : arrMin) {
            System.out.print(a + " ");
        }
        System.out.println("- массив в порядке возрастания методом пузырька");
    }

}
