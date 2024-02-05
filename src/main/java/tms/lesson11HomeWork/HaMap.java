package tms.lesson11HomeWork;



import tms.lesson11.Task5.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HaMap {
    public static void main(String[] args) {

        Map<Integer,String> states = new HashMap<Integer,String>();
        states.put(1,"Germany");
        states.put(2,"Spain");
        states.put(4,"France");
        states.put(3,"Italy");
        String first = states.get(2); //получение объекта по ключу 2
        System.out.println(first);

        Set<Integer> keys = states.keySet(); // получаем весь набор ключей

        Collection<String > values = states.values(); // получение набора всех значений

        states.replace(1,"Poland");//замена элемента
        states.remove(2);//удаление элемента по ключу
        //перебор элементов
        for(Map.Entry<Integer,String > item :states.entrySet()){
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
        Map<String, Person> people = new HashMap<String,Person>();
        people.put("12346", new Person("Tom"));
        people.put("34565", new Person("Bill"));
        people.put("97890", new Person("Nick"));
        for (Map.Entry<String ,Person> item: people.entrySet()){
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }

    }
}


