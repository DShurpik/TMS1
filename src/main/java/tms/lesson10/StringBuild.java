package tms.lesson10;

//Поиск в массиве строк минимально и максимальное значение и вывод их

import java.util.Scanner;

public class StringBuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ");
        int n = 6;
        String[] arrString = new String[n];
        int[] lenhgtString = new int[n];
        for (int i = 0; i < arrString.length; i++){
            arrString[i] = scanner.next();
            lenhgtString[i] = arrString[i].length();
        }
        int minValue = getMinValue(lenhgtString);
        int maxValue = getMaxValue(lenhgtString);
        System.out.println(minValue);
        System.out.println(maxValue);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i< n; i++){
            if(lenhgtString[i] == minValue){
                stringBuilder.append(arrString[i]).append(" ").append(lenhgtString[i]).append("\n");
            } if (lenhgtString[i] == maxValue){
                stringBuilder.append(arrString[i]).append(" ").append(lenhgtString[i]).append("\n");
            }
        }
        System.out.println(stringBuilder);
        }
    private static int getMinValue(int[] arrq){
        int minValue = arrq[0];
        for (int i = 0; i < arrq.length; i++){
            if (arrq[i] < minValue)
                minValue = arrq[i];
        }
        System.out.println("Минимум " + minValue);
        return minValue;
    }
    private static int getMaxValue(int[] arrq){
        int maxValue = arrq[0];
        for (int i = 0; i < arrq.length; i++){
            if (arrq[i] > maxValue)
                maxValue = arrq[i];
        }
        System.out.println("Минимум " + maxValue);
        return maxValue;
    }
}
