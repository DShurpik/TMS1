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

    public static void speak() {
    }
}
