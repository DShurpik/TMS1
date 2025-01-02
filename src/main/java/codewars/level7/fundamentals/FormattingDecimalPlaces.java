package codewars.level7.fundamentals;

import java.util.Arrays;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {
        System.out.println(twoDecimalPlaces(10.1289767789)); // 10.12
        System.out.println(twoDecimalPlaces(-7488.83485834983)); // -7488.83
        System.out.println(twoDecimalPlaces1(10.1289767789));
        System.out.println(twoDecimalPlaces1(-7488.83485834983));
        System.out.println(twoDecimalPlaces2(10.1289767789));
        System.out.println(twoDecimalPlaces2(-7488.83485834983));
    }

    public static double twoDecimalPlaces(double number) {
        int res = (int) number;
        String[] r = String.valueOf(number).split("");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < r.length; i++) {
            if (r[i].equals(".")) {
                str.append(r[i + 1]).append(r[i + 2]);
                break;
            }
        }
        String result = String.valueOf(res) + "." + str;
        return Double.parseDouble(result);
    }

    public static double twoDecimalPlaces1(double number)
    {
        String strN = String.valueOf(number);
        int dotIndex = strN.indexOf(".");
        String sub = strN.substring(0, dotIndex+3);
        double result = Double.valueOf(sub);
        return result;
    }

    public static double twoDecimalPlaces2(double number)
    {
        return ( (int)(number * 100) ) /100d;
    }
}
