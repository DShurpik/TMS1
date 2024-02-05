package tms.lesson12;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetFruitCollectionPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> fruits = new LinkedHashSet<>(); //Создание списка по порядку
        for (int i = 0; i < 10; i++) {  //через цикл
            String fr = scanner.next();
            fruits.add(fr);
        }
        printAllFruits(fruits);
        System.out.println("Хотите удалить элемент введите Да, если не хотите введите Нет");
        String st = scanner.next();
        while (!st.equals("Нет")) {
            if (st.equals("Да")) {
                System.out.println("Введите элемент который хотите удалить");
                String temp = scanner.next();
                fruits.remove(temp);
            }
            printAllFruits(fruits);
            System.out.println("Хотите удалить элемент введите Да, если не хотите введите Нет");
            st = scanner.next();
        }
    }
    static void printAllFruits(Set<String> fruits){
        for (String e : fruits) { //цикл для его вывода
            System.out.println(e);
        }
    }
}
