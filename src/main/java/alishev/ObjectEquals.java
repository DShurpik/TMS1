package alishev;

public class ObjectEquals {
    public static void main(String[] args) {
        // animal1 ----> {1}
        // animal2 ----> {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        Animal animal3 = animal2;

        System.out.println(animal1.equals(animal2));
        System.out.println(animal2.equals(animal3));
    }
}
class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj) { // переопределили метод
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
