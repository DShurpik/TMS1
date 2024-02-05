package tms.lesson4;

import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        exampleLesson4();
        exampleLesson4InputMatrix();
    }

    // Вывод двумерного массива
    private static void exampleLesson4(){
        int[][] tabl = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        //   0 1 2
        //------------индексы
        // 0|1 2 3
        // 1|4 5 6
        // 2|7 8 9
        // и
        // н
        // д
        // e
        // к
        // c

        for (int i = 0; i < tabl.length; i++) {
            System.out.println(tabl[2][0]);
            for (int j = 0; j < tabl[i].length; j++) {
                System.out.print(tabl[i][j] + ",");
            }
        }
    }

    // Ввод двумерного массива
    private static void exampleLesson4InputMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задай количество строк");
        System.out.println("Задай количество столбцов");
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Введите значение элемента для позиции " + i + " " + j);
                arr[i][j] = scanner.nextInt();
            }
        }

        // Цикл для вывода
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}
