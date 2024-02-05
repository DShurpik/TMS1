package tms.lesson9HomeWork.Task3;

import java.util.InputMismatchException;

public class User {

    String surname;
    String name;


    public String setSurname(String surname) throws InputMismatchException {
        if (surname.contains("1") || surname.contains("2") || surname.contains("3") || surname.contains("4") ||
                surname.contains("5") || surname.contains("6") || surname.contains("7") || surname.contains("8") || surname.contains("9")) {
            System.out.println("incorrect value surname, only letter ");
            throw new InputMismatchException();
        }
        this.surname = surname;
        return this.surname;
    }
    public String setName(String name) throws InputMismatchException {
        if (name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")||name.contains("5")||
        name.contains("6")||name.contains("7")||name.contains("8")||name.contains("9")){
            System.out.println("incorrect value name, only letter ");
            throw new InputMismatchException();
        }
        this.name = name;
        return this.name;
    }


}


