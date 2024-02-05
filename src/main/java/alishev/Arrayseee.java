package alishev;

import java.util.Arrays;

public class Arrayseee {
    public static void main(String[] args) {
        // инициализация массива с пустыми ячеками и заполнение через цикл
        int [] numbers = new int[5];
        // заполнение массива через цикл
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            System.out.print(numbers[i] + " "); // распечатывание через цикл
        }
        // создание массива с готовыми значениями
        int[] numbers1 = new int[]{10,20,30,40,50,60};

        int[][] numbers2 = {{50,60,70,80,90},{100,200,300,400,500,600}};

        System.out.print("\n" + Arrays.toString(numbers1) + " "); // расспечатывание массива через тустринг

        System.out.println("\n" + Arrays.deepToString(numbers2) + " "); // расспечатывание многомерного массива




    }
}
