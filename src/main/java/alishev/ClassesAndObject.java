package alishev;

public class ClassesAndObject {
    public static void main(String[] args) {
        //создание объекта класса person
        Person person1 = new Person();
        person1.setName("Max");
        person1.setAge(25);
        person1.setSex("Male");
        person1.hello();
        person1.speak();
        Person person2 = new Person();
        person2.name = "Natasha";
        person2.age = 25;
        person2.sex = "Female";
        person2.hello();
        person2.speak();

        int year1 = person1.calculateYearsTo100();
        int year2 = person2.calculateYearsTo100();

        System.out.println(person1.getName() + " получение имени через геттер");
        System.out.println(person2.getName() + " получение имени через геттер");

        System.out.println(person1.getAge() + " получение возраста через геттер");
        System.out.println(person2.getAge() + " получение возраста через геттер");

        //System.out.println(year1);
        //System.out.println(year2);

        System.out.println(person1.calculateYearsTo100());
        System.out.println(person2.calculateYearsTo100());

    }
}

class Person{
    //У класса могут быть
    // 1. Данные (поля)
    // 2. Действия которые может совершать (методы)
    String name; // поле с именем
    int age;     // поле с возрастом
    String sex;  // поле с полом

    // тут будут сеттеры и геттеры. Параметров в методе может быть очень много
    // Пример public void setNameAndAge(String username, int userage){
    // name = username;
    // age = userage или
    // this.name = username
    // this.age = userage}
    public void setName(String username) {
        // проверки на то что поле имя не пустое
        if (username.isEmpty()){
            System.out.println("name is empty");
        } else {
            this.name = username;
        }
    }
    public void setAge(int userage) {
        age = userage;
    }
    public void setSex(String usersex) {
        this.sex = usersex;
    }
    // геттеры. При вызове возвращается поля
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }

    //создаем метод для класса person. Метод это действие, которое может делать объект.
    // Void методы НИЧЕГО не возвращают
    int calculateYearsTo100(){ // возвращаем int переменную years
        int years = 100 - age;
        return years; //return возвращает int years и выходит из метода
    }
    void speak(){
        System.out.println("i am " + sex + " my name is " + name + " and i am " + age + " old");
        System.out.println("i am " + getSex() + " my name is " + getName() + " and i am " + getAge() + " old");
    }
    void hello(){
        System.out.println("Hello");
    }
}
