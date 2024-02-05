package codewars.level8.algoritmes;

public class WhatIsBetween {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int count = 0;
        for (int i = a; i <= b; i++) {
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int[] between(int a, int b) {
        int length = b - a + 1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            result[i] = a;
            a++;
        }
        return result;
    }
}
