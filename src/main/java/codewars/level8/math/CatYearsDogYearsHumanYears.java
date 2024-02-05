package codewars.level8.math;

public class CatYearsDogYearsHumanYears {
    public static void main(String[] args) {
        /** Конвертировать года человека в года собаки и кота*/
        /** https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b */
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYears = 0;
        int dogYears = 0;
        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;
        } else if (humanYears == 3){
            catYears = 28;
            dogYears = 29;
        } else if (humanYears > 3) {
            catYears = 28 + ((humanYears-3) * 4);
            dogYears = 29 + ((humanYears-3) * 5);
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}
