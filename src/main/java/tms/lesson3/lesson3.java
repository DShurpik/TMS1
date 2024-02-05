package tms.lesson3;

import java.util.Arrays;
import java.util.Random;

public class lesson3 {

    public static void main(String[] args) {
//        exampleForLesson3();
       // task2();
    }

    //Пример к третей лекции
    private static void exampleForLesson3(){
        int[] arrA = new int[]{1, 2, 3};
        //Присваивание по ссылке
        //int[] arrB = arrA;
        //Копирование значений
        int[] arrB = new int[3];
        System.arraycopy(arrA, 0, arrB, 0, 3);

        //Можно проверить как был создан массив B, через ссылку, или туда скопировани значения
        //arrB[0] = 9;
        for (int a : arrA) {
            System.out.println(a);
        }

        for (int b : arrB) {
            System.out.println(b);
        }

        //Корректное сравнение массивов arrA и arrB
        if (Arrays.equals(arrA, arrB)) {
            System.out.println("Они равны");
        }

        String example1 = "test";
        String example2 = "test";

        if (example1.equals(example2)) {
            System.out.println("Они равны");
        }

        int exampleNumber = 1;
        int exampleNumber2 = 1;

        if (exampleNumber == exampleNumber2) {
            System.out.println("Они равны");
        }
    }

    //Пузырьковая сортировка
    private static void task2() {
        //                new int[10];

//        for (int index = 0; index < arr.length; index++) {
//            arr[index] = randomInt();
//            System.out.println(arr[index]);
//        }
        int[] arr = new int[]{3, 2, 1, 4, 5, 7};


        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //Сравниваем два элемента
                if (arr[j] < arr[j + 1]) {
                    //Перестановка
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static int randomInt() {
        Random random = new Random();
        return random.nextInt(100);
    }


}
