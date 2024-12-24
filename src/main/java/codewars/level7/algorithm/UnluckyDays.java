package codewars.level7.algorithm;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {
    public static void main(String[] args) {
        System.out.println(unluckyDays(2015)); // 3
    }

    public static int unluckyDays(int year) {
        int fridaysCount = 0;
        for (int i = 1; i <= 12; i++) {
            LocalDate date = LocalDate.of(year, i, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridaysCount++;
            }
        }
        return fridaysCount;
    }
}
