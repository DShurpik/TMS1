package alishev.anonimclass;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        AnotherAnimal anotherAnimal = new AnotherAnimal();
        anotherAnimal.eat();

        Animal animal2 = new Animal() { // открываем скобки и можем переопределять методы создаваемого объекта
            public void eat(){          // Создаваемый объект это наследник класса animal
                System.out.println("Another animal2 eat");
            }
        };
        animal2.eat();

    }
}

class AnotherAnimal extends Animal{
    public void eat(){
        System.out.println("Another animal eat");
    }
}

class Animal {
    public void eat(){
        System.out.println("Animal eat");
    }
}