package tms.lesson3;

public class StupidSort {
    public static void main(String[] args) {
        int[] arr = {18, 10, 13, 9, 2, 20};
        stupidSort(arr);

    }

    private static void stupidSort(int[] arr){ //Сделать глупую сортировку
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println(arr[j] + " " );
            //+ j + ",");
            //Сравниваем два элемента
            if (arr[j] > arr[j + 1]) {
                //Перестановка
                int tmp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = tmp;
                j = -1;
                System.out.println("Сначала");
            }
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
