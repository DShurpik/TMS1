package codewars.level8.math;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(0,1,1));// 61000
    }
    public static int Past(int h, int m, int s) {
        int totalSec = (h * 3600) + (m * 60) + s;
        return totalSec * 1000;
    }
}
