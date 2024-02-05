package tms.lesson10HomeWork.Task1;

public class PersonService {
    public static void main(String[] args) {

    Person person = new Person();
    person.setNumber();
    person.getStr();
    System.out.println(person.getNumber() + " " + person.getStr());

    Person person1 = new Person(8);
    System.out.println(person.getNumber() + " " + person1.getStr());

}

}
