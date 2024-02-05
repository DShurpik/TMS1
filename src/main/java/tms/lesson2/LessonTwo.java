package tms.lesson2;

import java.util.Random;
import java.util.Scanner;

public class LessonTwo {

    public static void main(String[] args) {
        //Чтобы выполнить кокретную задачу, расскомментируйте вызов ниже
//        taskTwo();
//        sumOfEvenNumber();
//        printMonthByNumber();
//        printNumbersInWords();
//        generateArrayAndFindMax();
    }

    private static void exampleEquals(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтобы узнать, больше 3 оно или нет");
        int inputNum = scanner.nextInt();

        // Этот код эквивалентен тому, что ниже
        if (inputNum > 3){
            System.out.println("Больше");
        } else{
            System.out.println("Меньше");
        }
        System.out.println("Вы ввели число " + inputNum);

        // Этот код эквивалентен тому, что выше
        String result = inputNum > 3 ? "Больше" : "Меньше";
        System.out.println(result);
    }

    private static void exampleEqualsFor(){
        int[] arr = new int []{1,12,2,3};
        System.out.println("Демонстрация разной реализации, прохода по массиву");
        //Этот цикл равносилен циклу ниже
        for(int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        //Этот цикл равносилен циклу выше
        for(int elementArr : arr) {
            System.out.println(elementArr);
        }
    }

    /**
     * 1) Дано целое число. Если оно является положительным, то прибавить к нему 1. Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число
     */
    private static void taskTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        System.out.println("Если оно является положительным, то прибавить к нему 1. Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10");
        int inputNum = scanner.nextInt();
        if (inputNum > 0) {
            inputNum = inputNum + 1;
        } else if (inputNum < 0) {
            inputNum = inputNum - 2;
        } else {
            inputNum = 10;
        }
        System.out.println(inputNum);
    }

    /**
     * 2) С помощью цикла FOR посчитать сумму четных элементов от 10 до 55
     */
    private static void sumOfEvenNumber(){
        int evenSum = 0;
        for (int i = 10; i <= 55; i++){
            if (i % 2 == 0){
                evenSum = evenSum + i;
            }
        }
        System.out.println(evenSum);
    }




    /**
     * 4) Задача: Сделать цикл (for) от 1го до 10ти, каждая итерация которого будет выведена словами на экран. Например:
     *
     * “один”
     * “два”
     * …
     * “десять”
     */
    public static void printNumbersInWords() {
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    System.out.println("Один");
                    break;
                case 2:
                    System.out.println("Два");
                    break;
                case 3:
                    System.out.println("Три");
                    break;
                case 4:
                    System.out.println("Четыре");
                    break;
                case 5:
                    System.out.println("Пять");
                    break;
                case 6:
                    System.out.println("Шесть");
                    break;
                case 7:
                    System.out.println("Семь");
                    break;
                case 8:
                    System.out.println("Восемь");
                    break;
                case 9:
                    System.out.println("Девять");
                    break;
                case 10:
                    System.out.println("Десять");
                    break;
            }
        }
    }

    /**
     * 5) Задача найти максимум в массиве
     */
    public static void generateArrayAndFindMax() {
        int[] arr = new int[10];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = randomInt();
            System.out.println(arr[index]);
        }
        maximum(arr);
    }
    private static void maximum(int[] arr) {
        int maxValue = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > maxValue)
                maxValue = arr[index];
        }
        System.out.println("Максимум: " + maxValue);
    }
    private static int randomInt() {
        Random random = new Random();
        return random.nextInt(100);
    }

}

