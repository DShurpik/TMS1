package tms.lesson10HomeWork.Task3;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ");
        int n = 5;
        String[] arrString = new String[n];
        int[] lenhgtString = new int[n];
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = scanner.next();
            lenhgtString[i] = arrString[i].length();
        }
        int minValue = getMinValue(lenhgtString);
        int maxValue = getMaxValue(lenhgtString);
        int argValue = getAargValue(new int[]{n});

        System.out.println(argValue);
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        for (int i = 0; i < n; i++) {

            if (lenhgtString[i] == argValue){
                stringBuilder.append(arrString[i]).append(" ").append(lenhgtString[i]).append(" ! ");
            }

        }
        System.out.println(stringBuilder);
    }

    private static int getAargValue(int[] lenhgtString) {

        int argValue = (getMaxValue(lenhgtString)+getMinValue(lenhgtString))/2;
        System.out.println("Args " + argValue);
        return argValue;
    }

    static int getMinValue(int[] arrq){
        int minValue = arrq[0];
        for (int i = 0; i < arrq.length; i++){
            if (arrq[i] < minValue)
                minValue = arrq[i];
        }

        return minValue;
    }
    static int getMaxValue(int[] arrq){
        int maxValue = arrq[0];
        for (int i = 0; i < arrq.length; i++){
            if (arrq[i] > maxValue)
                maxValue = arrq[i];
        }

        return maxValue;
    }

}