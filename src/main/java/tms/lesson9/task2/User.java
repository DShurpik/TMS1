package tms.lesson9.task2;

import java.util.InputMismatchException;

public class User {
    String name;

    public String name(String name){

        if (name.contains("1") ||
                name.contains("2") ||
                name.contains("3") ||
                name.contains("4") ||
                name.contains("5")){

            System.out.println("Данные введены неверно");
            throw new InputMismatchException();
        }
        this.name = name;
        return this.name;
    }
}
