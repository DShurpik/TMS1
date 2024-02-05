package tms.lesson2;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
     public static void main(String[] args) {
         task1a_2();
        task1b_2();
         task2_2();
         task3_2();
         task4();
     }
     private static void task1a_2(){
         // Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
        int[] num = new int[]{-1, 10, -5};
         System.out.print("Исходный массив: ");
         for (int i = 0; i < num.length; i++){
             System.out.print(num[i] + " ");
         }
        int a = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0){
                a++;
            }
        }
         System.out.println();
        System.out.println("Количество положительных: " + a);
        }
        //Дан массив. Найти количество положительных чисел в исходном наборе.
        private static void task1b_2(){
        int[] num = new int[]{-1, 10, 10, -5, 5, -8, 8};
            System.out.print("Исходный массив: ");
            for (int i = 0; i < num.length; i ++){
                System.out.print(num[i] + " ");
            }
        int a = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] > 0){ a = a + 1;
            } else {continue;}
        }
            System.out.println();
        System.out.println("Количество положительных: " + a);
    }
        //Три целых числа вводятся из консоли. Найти количество положительных и отрицательных чисел в исходном наборе
        private static void task2_2(){// Задание 2 найти количество + и -
         Scanner scan = new Scanner(System.in);
         int[] num = new int[5];
         for (int i = 0; i<num.length; i++){   //Заполняем массив
             System.out.println("Введите значение элемента для позиции " + i + " ");
             num[i] = scan.nextInt();
         }
            System.out.print("Массив: ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            int pos = 0;
            int neg = 0;
            for (int i =0; i < num.length; i++){
                if (num[i] > 0){
                    pos++;
                } else if (num[i] < 0){
                    neg++;
                }
            }
            System.out.println();
            System.out.println("Количество положительных чисел " + pos);
            System.out.println("Количество отрицательных чисел " + neg);
    }

  private static void task3_2(){
         // Найти минимум в массиве
        int [] arr = new int[10];

      for (int i = 0; i < arr.length; i++) {
          arr[i] = RandomInt();// заполняет массив рандомными числами в границах 100
          System.out.println("arr [" + i + "]=" + arr[i] + ";");// выводим массив заполненный рандомными числами
      }
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        System.out.println("Минимум " + minValue);
    }
    private static int RandomInt(){
        Random random = new Random();
        return random.nextInt(100);
    }







    private static void task4(){                // Задание 4
        /**
         * 4) * (Дополнительно) В переменную записываете количество программистов.
         * В зависимости от количества программистов необходимо вывести правильно окончание.
         * Например: • 2 программиста • 1 программист • 10 программистов • и т.д
         */

            Scanner scanner  = new Scanner(System.in);
            System.out.println("Введите количество программистов:");
            int prog = scanner.nextInt();
            if(prog % 10 == 2 && (prog - 12) % 100 !=0 ||
                    prog % 10 == 3 && (prog - 13) % 100 !=0 ||
                    prog % 10 == 4 && (prog - 14) % 100 !=0){
                System.out.println(prog + " программиста");
            } else if(prog % 10 == 1 && (prog - 11) % 100 != 0){
                System.out.println(prog + " программист");
            } else if(prog < 0){
                System.out.println("Введите корректное число программистов!");
            } else {
                System.out.println(prog + " программистов");
            }
        }
}





