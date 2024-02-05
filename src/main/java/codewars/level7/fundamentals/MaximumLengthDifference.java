package codewars.level7.fundamentals;
// https://www.codewars.com/kata/5663f5305102699bad000056/train/java

public class MaximumLengthDifference {
    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(s1, s2)); // 13
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        int sum = 0;
        for (String x : a1) {
            for (String y : a2) {
                int diff = Math.abs(x.length() - y.length());
                if (diff > sum) {
                    sum = diff;
                }
            }
        }
        return sum;
    }
}
