package tms.lesson3;

public class SortMax {
    public static void main(String[] args) {

        int[] arr = {5, 15, 6, 12, 7, 9};

        sortMax(arr);


    }

    private static void sortMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("- массив в порядке убывания методом пузырька");
    }
}