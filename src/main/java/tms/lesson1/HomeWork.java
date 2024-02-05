package tms.lesson1;

import java.util.Scanner;

public class HomeWork {
    public static void main (String [] args) {
        task1_1();
        task2_1();
        task3_1();
        task4_1();
        task5_1(3.14,5.64);
    }

        private static void task1_1 (){
            // даны 2 числа, вывести меньшее из них
            System.out.println("Введите два целых числа");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println("Меньшее число " + a);
            } else {
                System.out.println("Меньшее число " + b);
            }
            //Задание 1	Даны 2 числа. Вывести большее из них.
            System.out.println("Введите два числа");
            Scanner scanner1 = new Scanner(System.in);
            double calc1 = scanner1.nextDouble();
            double calc2 = scanner1.nextDouble();

            if (calc1 > calc2) {
                System.out.println("Большее  число " + calc1);
            } else {
                System.out.println("Большее  число " + calc2);
            }
        }

        private static void task2_1 () {
            // даны 2 числа, вывести их сумму
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите целые числа");
            int c = scanner2.nextInt();
            int d = scanner2.nextInt();
            System.out.println("Cумма чисел = " + (c + d));
    }

            private static void task3_1 () {
                // даны 3 числа, 2 целых и 1 с точкой, вывести произведение
                Scanner scanner = new Scanner(System.in);
                int e = scanner.nextInt();
                int f = scanner.nextInt();
                double g = scanner.nextDouble();
                double pr = e * f * g;

                System.out.println("Произведение чисел= " + pr);
            }


        private static void task4_1(){
            // даны 2 числа вывести остаток от деления
            Scanner scanner = new Scanner(System.in);
            int h = scanner.nextInt();
            int i = scanner.nextInt();
            System.out.println("Остаток от деления " + h % i);
        }

        private static void task5_1(double d1, double d2){

            int sum = (int)Math.round(d1) + (int)Math.round(d2); //функция округления
            System.out.println("Целочисленное значение суммы=" +sum);


            // даны 2 числа с точкой, привести их сумму к целому значению
            double p = 3.75;
            double q = 5.554;
            int y = (int) (p + q);
            System.out.println(y);
        }
    }
