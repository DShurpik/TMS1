package codewars.level8.fundamentals;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class IsYourPeriodLate {
    public static void main(String[] args) {
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28));
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        long days = DAYS.between(last, today);
        return days > cycleLength;
    }

    public static boolean periodIsLate1(LocalDate last,LocalDate today,int cycleLength) {
        return DAYS.between(last, today) > cycleLength;
    }
}
