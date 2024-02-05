package tms.lesson11HomeWork;

import tms.lesson11.Task5.Person;

import java.util.HashSet;
import java.util.Set;

public class UserHashSet {
    public static void main(String[] args) {
        Set<String> states = new HashSet<String>();
        states.add("Germany");
        states.add("France");

        //попытка добавить элемент который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded); // result -- false

        System.out.printf("Set contains %d elements \n", states.size());
        for (String state:states){
            System.out.println(state);
        }

        states.remove("Germany"); // удаление элемента

        HashSet<Person> people = new HashSet<Person>(); // хеш таблица элементов Person
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));

        for (Person p :people){
            System.out.println(p.getName());
        }}
    }

