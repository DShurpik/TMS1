package codewars.level7.fundamentals;

public class AllStarCodeChallenge {
    public static String toTime(int seconds){
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;
        return String.format("%d hour(s) and %d minute(s)", hours, minutes);
    }

    public static void main(String[] args) {
        String result = toTime(3600);
        System.out.println(result);
    }
}
