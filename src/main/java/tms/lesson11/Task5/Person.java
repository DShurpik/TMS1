package tms.lesson11.Task5;

public class Person {
    String name;
    String numberPhone;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public Person(String name) {

    }

    public String getName() {
        return this.name;
    }
    String getNomberPhone(){
        return this.numberPhone;
    }
}

