package alishev;

public class HumanThis {
    public static void main(String[] args) {
        // создаем объект класса human
        Human human1 = new Human();
        human1.setName("Carl");
        human1.setAge(30);
        System.out.println(human1.getName());
        System.out.println(human1.getAge());
        human1.getInfo();

        Human human2 = new Human();
        human2.name = "Mark";
        human2.age = 31;
        System.out.println(human2.name);
        System.out.println(human2.age);
        human2.getInfo();

    }
}
class Human{
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println("My name is " + getName() + ", and i have " + getAge() + " years");
    }
}
