package codewars.level7.strings;

import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        seconds = seconds - h * 3600 - m * 60;
        h = h % 24;

        System.out.format("%02d:%02d:%02d", h, m, seconds);
    }
}
