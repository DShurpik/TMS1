package alishev.abstractaclass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(); //Сущности которые существуют и наследуются от animal
        Dog dog = new Dog();

        dog.makeSound();
        dog.makeSound("SOUND");
        cat.makeSound();
        cat.makeSound("SOUND");

        dog.eat();
        cat.eat();

    }
}
