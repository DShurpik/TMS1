package tms.lesson11.Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SamplUseMapDifficultProject {
    public static void main(String[] args) {


        Map<String, Person> persons = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        while (!value.equals("stop")){
            System.out.println("Enter name man: ");
            String name = value;
            System.out.println("Enter number phone: ");
            String phoneNumber = sc.next();

            Person person = new Person(name, phoneNumber);
            persons.put(name,person);
            value = sc.next();
        }
        for (Person element: persons.values()) {
            System.out.println(element.getName());
        }
    }
}
