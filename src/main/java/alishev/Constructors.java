package alishev;

public class Constructors {
    public static void main(String[] args) {

        Aspirant aspirant1 = new Aspirant();
        // назначение полей напрямую
        aspirant1.name = "Bob";
        aspirant1.age = 21;
        aspirant1.printInfo();

        Aspirant aspirant2 = new Aspirant();
        // назначение полей с помощью методов
        aspirant2.setName("Carl");
        aspirant2.setAge(22);
        aspirant2.printInfo();

        Aspirant aspirant3 = new Aspirant("Max");
        aspirant3.setAge(20);
        aspirant3.printInfo();

        Aspirant aspirant4 = new Aspirant("John", 19);
        aspirant4.printInfo();
        aspirant4.getName();

    }
}
class Aspirant {

    // Перегрузка методов в java
    // В программе мы можем использовать методы с одним и тем же именем, но с разными типами и/или количеством параметров.

    // конструктор по умолчанию
    public Aspirant(){
        System.out.println("конструктор по умолчанию");
    }
    public Aspirant(String name){
        System.out.println("2-й конструктор с полем имя");
        this.name = name;
    }
    public Aspirant(String name, int age){
        System.out.println("3-й конструктор с полями имя и возраст");
        this.name = name;
        this.age = age;
    }





    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println(getName() + ", " + getAge());
    }
}
