package codewars.level8.math;

public class HolidayDutyFree {
    public static void main(String[] args) {
        System.out.println(dutyFree(12,50,1000)); // 166
        System.out.println(dutyFree(17,10,500));
    }

    public static int dutyFree(int normPrice, int discount, int hol) {
        double i = normPrice * discount;
        double j = hol / i;
        double sum = j * 100;
        return (int) sum;
    }
}
