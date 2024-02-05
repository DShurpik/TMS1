package tms.lesson12;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> fruits = new LinkedHashSet<>(); //Создание списка по порядку
        for (int i = 0; i < 5; i++) {  //через цикл
            String fr = scanner.next();
            fruits.add(fr);
        }

        for (String e : fruits) { //цикл для его вывода
            System.out.println(e);
        }
        System.out.println("Вывод через while");
        Iterator value = fruits.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}

