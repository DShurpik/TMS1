package tms.lesson8HomeWork.Task1Ver2;

import java.util.Scanner;

public class MonthsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputParam = scanner.nextInt();
        System.out.println(Months.getValue(inputParam));
    }
}
