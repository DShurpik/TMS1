package tms.lesson11.Task4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SampleUseSet {
    public static void main(String[] args) {
//        Set<String> collection = new HashSet<>();
//        collection.add("Vanya");
//        collection.add("Vanya");
//        collection.add("Petya");
//
//        for (String element : collection) {
//            System.out.println(element);
//        }
        Scanner sc = new Scanner(System.in);
        Set<Person> persons = new HashSet<>();
        String value = sc.next();
        while (!value.equals("stop")){
            Person person = new Person(value);
            persons.add(person);
            value = sc.next();
        }
        for (Person element: persons) {
            System.out.println(element.getName());
        }
    }
}