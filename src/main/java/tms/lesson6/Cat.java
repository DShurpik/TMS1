package tms.lesson6;

public class Cat {
    String name;
    int age;
    int gramm;

    Cat (String name, int age, int gramm ){
        this.name = name;
        this.age = age;
        this.gramm = gramm;
    }
    public boolean checkSatiety(){
        return gramm > 100;
    }
    public String toString(){
        return "Имя кота: " + name + " Возвраст: " + age + " Граммы: " + gramm;
    }
}
