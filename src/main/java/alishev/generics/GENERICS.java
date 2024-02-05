package alishev.generics;

import java.util.ArrayList;
import java.util.List;

public class GENERICS {
    public static void main(String[] args) {

        ////////// JAVA 5 //////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");//0
        animals.add("dog");//1
        animals.add("frog");//2
        animals.add(ourAnimal);// объект класса animal

        String animal = (String) animals.get(3);// тут мы даункастим
        System.out.println(animal);

        ///////////// GENERICS //////////////////
        List <String> animals2 = new ArrayList<>(); // в <> помечаем объекты какого класса будем помещать в лист
        animals2.add("lion");
        animals2.add("tiger");
        animals2.add("wolf");
        // тут даункастить нету необходимости
        System.out.println(animals2.get(2));

        //////////// JAVA 7 ///////////////////
        List<String> animals3 = new ArrayList<>();
    }
}
class Animal{

}
