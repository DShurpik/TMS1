package tms.lesson7;

public class Person {
    protected String name;
    protected String surname;

    public Person(){

    }
    public Person(String inputParamName, String inputParamSurname){
        name = inputParamName;
        surname = inputParamSurname;
    }

    public String getName(){
        return name == null ? "No name" : name;
    }

    public String getSurname(){
        return surname == null ? "No surname" : surname;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + " Surname: " + surname);
    }

}
