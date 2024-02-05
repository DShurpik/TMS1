package alishev.polimorfizm;

public class Service {
    public static void main(String[] args) {
        Animal animal1 = new Dog();// создали объкт класса dog. Т.е тут dog как animal
        animal1.eat();  // выводится то что определено в потомке, всегда выводится тот методк, который определен в потомке
                        // и это называется поздним связыванием

        Dog dog1 = new Dog(); // тут объект Dog как dog
        dog1.eat();
        dog1.bark();

        System.out.println("=============");

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();

        test(animal2);
        test(dog2);
        test(cat2);

        // Т.к мы в методе тест принимаем как параметр Animal, и из-за того что от него наследуются другие классы
        // мы можем метод тест вызывать и на другие классы dog и cat

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
