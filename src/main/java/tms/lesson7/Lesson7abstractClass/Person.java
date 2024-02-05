package tms.lesson7.Lesson7abstractClass;

public abstract class Person {
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

    public abstract void displayInfo();
    }


