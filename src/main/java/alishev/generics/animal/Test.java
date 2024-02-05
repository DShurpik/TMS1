package alishev.generics.animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        listOfAnimals.add(new Animal(3));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(2));
        listOfDogs.add(new Dog(3));

        test(listOfDogs);

        List<Pudel> listOfPudel = new ArrayList<>();
        listOfPudel.add(new Pudel(1));
        listOfPudel.add(new Pudel(2));

        test(listOfPudel);

        /**     Иерархия наследования
         *          Object
         *          Animal
         *          Dog
         * */

    }
                                // ? extends что можем в листе обрабатывать листы которые наследуются
    private static void test(List<? extends Animal> list){ // ? что можем обрабатывать листы с различными объектами
        for (Animal animal : list){
            System.out.println(animal);
            animal.eat();
        }
    }

}
