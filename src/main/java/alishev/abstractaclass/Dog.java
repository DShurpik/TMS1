package alishev.abstractaclass;

public class Dog extends Animal{

    @Override
    public void makeSound() {
            System.out.println("bark");
    }
    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }
}
