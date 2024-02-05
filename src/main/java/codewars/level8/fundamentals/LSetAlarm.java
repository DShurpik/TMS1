package codewars.level8.fundamentals;

public class LSetAlarm {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
        System.out.println(setAlarm(false,false));

    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed == true && vacation == false;
    }
}
