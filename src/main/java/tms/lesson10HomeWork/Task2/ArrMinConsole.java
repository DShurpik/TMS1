package tms.lesson10HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrMinConsole {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> arrInt = new ArrayList<>();

        System.out.println("Введите числа (ввод иного символа прекращает работу программы)");
        while (scan.hasNextInt()) {
            arrInt.add(scan.nextInt());
        }

        findMin(arrInt);

    }

    public static void findMin(List<Integer> arrInt) {
        int min = arrInt.get(0);
        for (int i = 0; i < arrInt.size() - 1; i++) {
            if (min > arrInt.get(i + 1)) {
                min = arrInt.get(i + 1);
            }
        }

        System.out.print("Минимальное число из введённых выше  " + min);
    }

}
