package codewars.level8.switchcase;

public class Return_day {
    public static void main(String[] args) {
        System.out.println(getDay(1));
        System.out.println(getDay(3));
        System.out.println(getDay(8));
    }
    public static String getDay(int n) {
        switch (n) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Wrong, please enter a number between 1 and 7";
        }
    }
}
