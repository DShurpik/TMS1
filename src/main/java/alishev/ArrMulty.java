package alishev;

import java.util.Arrays;

public class ArrMulty {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14}};
        System.out.println(arr[2][2]);

        //распечатка многомерного массива через метод и через цикл
        System.out.print(Arrays.deepToString(arr) + "\n");

        for (int i = 0; i < arr.length; i++){     //внешний цикл проходится по строкамБ внутренний по столбцам
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " "); // печать строки
            }
            System.out.println(""); //переход на след строку печати
        }
    }
}
