package alishev.abstractaclass;

public abstract class Animal {
    public void eat(){
        System.out.println("animal eats");
    }



    public abstract void makeSound();// у абстрактного класса есть метод но в методе нету реализации
    public abstract void makeSound(String sound);
}
// абстрактный класс не можем создавть объект этого класса
// наследники должны реализовать методы абстрактного класса

// интерфейс, то что умеет объект. Это контракт на исполнение методов
// абстрактный класс, то чем объект является. Класс, с поведением и соглашаемся
