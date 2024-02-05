package tms.lesson7HomeWork;

import java.util.Date;

public class AnimalService {
    public static void main(String[] args){

        Cat cat = new Cat();
        cat.setAnimalID(1);
        cat.setName("barsik");
        Date data = new Date();
        cat.setData(data);
        cat.setEyesColor("green");

        Dog dog = new Dog();
        dog.setAnimalID(1);
        dog.setName("Polkan");
        dog.setData(data);
        dog.setWeight(12.5);

        Tiger tiger = new Tiger();
        tiger.seteatsEmployee(1);
        tiger.setAnimalID(1);
        tiger.setName("Shere Khan");
        tiger.setData(data);


        callPrint(cat);
        callPrint(dog);
        callPrint(tiger);

    }
    private static void callPrint(Animal animal){
        animal.printInfo();
        animal.printVoice();
        String voice = animal.getVoice();
        System.out.println(voice);

    }


}
