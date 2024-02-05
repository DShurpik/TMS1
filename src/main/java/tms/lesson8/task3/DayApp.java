package tms.lesson8.task3;

import java.util.Scanner;

public class DayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputParametr = scanner.nextInt();
        System.out.println(DayWeeks.getValueOfDayWeekByNumber(inputParametr));
    }
}
