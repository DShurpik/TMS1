package alishev.inheritance;

public class AnimalServ {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        Dog dog1 = new Dog();
        dog1.name = "Sharik";
        dog1.eat();
        dog1.bark();
        dog1.sleep();
        dog1.showName();

        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.eat();
        cat1.meow();
        cat1.sleep();
    }
}
