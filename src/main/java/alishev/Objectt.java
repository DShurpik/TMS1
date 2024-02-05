package alishev;

public class Objectt {
    public static void main(String[] args) {
        Cats cats1 = new Cats("Barsik", 5);
        System.out.println(cats1.toString());
        System.out.println(cats1.toString()); // toString из класса Object возвращает хэш код каждого объекта
    }
}
class Cats{
    private String name;
    private int age;
    public Cats(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){   // повторяя сигнатуру метода, переопределяем метод для объекта
                                // тут мы переопределили метод от класса объект на метод класса кот
        return name + " " + age;
    }
}
