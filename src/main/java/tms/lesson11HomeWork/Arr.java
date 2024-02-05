package tms.lesson11HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>(); // создание списка
        //добавление элементов
        people.add("Tom");
        people.add("Alise");
        people.add("Kate");
        people.add("Sem");

        people.add(1,"Bob");//добавляем элемент по индексу 1
        System.out.println(people.get(1)); // получаем элемент по индексу 1

        people.set(1, "Robert"); //установка нового значение для элемента по индексу 1

        System.out.printf("ArrayList has %d elements \n" , people.size()); //%d - для вставки объекта

        for (String person : people){
            System.out.println(person);
        }

        if(people.contains("Tom")){ //проверяем наличие элемента
            System.out.println("ArrayList contains Tom");
        }

        people.remove("Robert"); //удаление конкретного элемента
        people.remove(0);// удаление элемента по индексу

        Object[] peopleArray = people.toArray(); // toArray () используется для получения массива,
        // который содержит все элементы в объекте ArrayList в правильной последовательности
        for(Object person : peopleArray){
            System.out.println(person);
        } }

    }

