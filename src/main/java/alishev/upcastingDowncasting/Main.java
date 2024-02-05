package alishev.upcastingDowncasting;

public class Main {
    public static void main(String[] args) {
        // upcasting - Восходящее преобразование
        Dog dog = new Dog();
        //Произошло восходящее преобразование. Наша собака по иерархии наследования ушла вверх в класс animal
        Animal animal = dog; // Объект воспринимается как родителя, и дог рассматриваем как animal



        // downcasting - низходящее преобразование

        Dog dog2 = (Dog)animal; // надо явно указать кто находится в переменной типа Animal
        dog2.bark();


        // Преобразование с ошибкой
        Animal a = new Animal();
        Dog dog3 = (Dog) a;
        dog3.bark();

    }
}
