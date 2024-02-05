package tms.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args){
        task1a();
        task1b();
        task2();
        task3();
    }

    private static int RandomInt(){
        Random random = new Random();
        return random.nextInt(50);
    }

    private static void task1a(){ //  сортировка массива по возрастанию
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = RandomInt();// заполняет массив рандомными числами в границах 100
            System.out.println("arr [" + i + "]=" + array[i] + ";");// выводим массив заполненный рандомными числами
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    }
                }
            }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    private static void task1b() {   // Сортировка массива по убыванию
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = RandomInt();
            System.out.println("arr [" + i + "]=" + array[i]+ ";");
        }

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
    }

    /**
     * Сортировка массива в порядке убывания методом пузырька
     */
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

    /**
     * Сортировка массива в порядке возрастания методом пузырька
     */
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



    private static void task2(){ //Сделать глупую сортировку
        int[] arr = new int[]{5, 2, 1, 3, 9, 0};
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
    private static void task3() { // Найти минимум в двумерном массиве
        System.out.println("Введите число строк и число столбцов массива");
        Scanner sc = new Scanner(System.in);
        int Arr[][] = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Введите значение элемента для позиции " + i + " " + j);
                Arr[i][j] = sc.nextInt();
            }
        }

        // Вывод исходного массива
        System.out.print("Исходный массив");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
        }
        twoDimensionalMin(Arr);
    }
    private static void twoDimensionalMin(int myArr[][]){

        int minArr = myArr[0][0];

        for (int i=0; i< myArr.length; i++) { //по строкам
            int minInStr = myArr[i][0]; //минимальный элемент первый в строке
            for (int j = 1; j < myArr[i].length; j++) { // по столбцам, столбец идет с 1
                if (myArr[i][j] < minInStr)
                    minInStr = myArr[i][j];
            }
            System.out.println("Минимум в строке: " + minInStr);

            if (minInStr < minArr) {
                minArr = minInStr;
            }
        }
        System.out.println();
        System.out.println( "Минимальный эллемент массива: " + minArr );
    }
}