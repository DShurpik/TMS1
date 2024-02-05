package tms.lesson1;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {



            int[] arr = new int[]{1, 2, 3};
            System.out.println("For each");
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println("Просто For");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

            Scanner scanner = new Scanner(System.in);
            int value;
            do {
                System.out.println("Enter 5");
                value = scanner.nextInt();
            } while (value != 5);

            System.out.println("You enter 5");

        }
    }