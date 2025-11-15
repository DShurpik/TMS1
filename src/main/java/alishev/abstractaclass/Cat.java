package alishev.abstractaclass;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    public void eat() {
        super.eat();
        System.out.println("Cat is eating");
    }

    public static void speak() {
    }
}
