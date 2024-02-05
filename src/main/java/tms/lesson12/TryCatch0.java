package tms.lesson12;
//делить на 0 и обработать исключения

import java.util.Scanner;

public class TryCatch0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        try {
            System.out.println("Введи делимое");
            int a = scanner.nextInt();
            System.out.println("Введи делимое");
            System.out.println(a/b);
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка деления на ноль. Введи повторно");
            System.out.println(scanner.nextInt());
            System.out.println("На 0 делить нельзя");
        }
    }
}
