package alishev.polimorfizm;

public class Dog extends Animal{

    public void eat(){ // переопределили родительский метод т.к сигнатуры совпадают с родительским методом
        System.out.println("Dog eat meat");
    }

    public void bark(){
        System.out.println("barking");
    }
}
