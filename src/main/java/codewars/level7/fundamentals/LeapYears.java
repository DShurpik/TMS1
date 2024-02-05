package codewars.level7.fundamentals;

import java.time.Year;

// https://www.codewars.com/kata/526c7363236867513f0005ca/train/java
public class LeapYears {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(2015)); // false
        System.out.println(isLeapYear(2100)); // false
        System.out.println(isLeapYear1(2100)); // false
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear1(int year) {
        return Year.isLeap(year);
    }
}
