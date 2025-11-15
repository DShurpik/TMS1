package alishev.inheritance;

public class Dog extends Animal{

    @Override
    public void eat(){   // тут мы переопределили метод из класса animal
        System.out.println("i am eating meat");
    }

    public void bark(){
        System.out.println("i am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}
