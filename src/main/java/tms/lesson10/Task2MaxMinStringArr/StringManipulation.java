package tms.lesson10.Task2MaxMinStringArr;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {


        System.out.println("Введите ");

        Scanner scan = new Scanner(System.in);
        int n = 3;
        String[] arrString = new String[n];
        int[] lenghtString = new int[n];    //массив длины строк; создали числовой массив - когда вводим строки, появляется Объект СТРОКА со свойством Длина
        for (int i = 0; i < n; i++) {

            arrString[i] = scan.next();

            //System.out.println(arrString[i]);

            lenghtString[i] = arrString[i].length();

            //System.out.println("Вывести длину " + lenghtString[i]);   //так плохо, тк в цикле строка с плюсом (с 21-00)

        }

        int freeMin = getMinValue(lenghtString);
        int freeMax = getMaxValue(lenghtString);

        //System.out.println("Выводим минимальное значение " + freeMin);


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (lenghtString[i] == freeMin)
                builder.append(arrString[i]).append(" ").append(lenghtString[i]).append("\n");
            if (lenghtString[i] == freeMax)
                builder.append(arrString[i]).append(" ").append(lenghtString[i]).append("\n");

        }

        System.out.println(builder);


    }

    private static int getMinValue(int[] arrQwe) {

        int minValue = arrQwe[0];

        for (int i = 0; i < arrQwe.length; i++) {
            if (arrQwe[i] < minValue)
                minValue = arrQwe[i];
        }

        System.out.println();
        System.out.println("Минимальное значение массива: ");
        System.out.println(minValue);

        return minValue;

    }

    private static int getMaxValue(int[] arrQwe) {

        int maxValue = arrQwe[0];

        for (int i = 0; i < arrQwe.length; i++) {
            if (arrQwe[i] > maxValue)
                maxValue = arrQwe[i];
        }

        System.out.println();
        System.out.println("Максимальное значение массива: ");
        System.out.println(maxValue);

        return maxValue;

    }
}
