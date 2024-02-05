package tms.lesson9HomeWork.Task4Throw;

import java.util.InputMismatchException;

public class User {
    String name;
    String surname;

    public void setNameAndSurname(String name, String surname) {

        if (surname.matches("[\\p{L}| ]+") && name.matches("[\\p{L}| ]+")) {
            this.name = name;
            this.surname = surname;
        } else {
            System.out.println("Данные содержат недопустимые символы");
            throw new InputMismatchException();

        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;

    }
}
