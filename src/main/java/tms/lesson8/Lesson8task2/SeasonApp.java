package tms.lesson8.Lesson8task2;

public class SeasonApp {
    public static void main(String[] args) {

        Season season = Season.WINTER;

        String result = season.seasoninfo();

        System.out.println(Season.SUMMER);
        System.out.println(result);
        System.out.println(Season.WINTER.seasonValue);

    }
}
