package tms.lesson10HomeWork.Task1;

import java.util.Scanner;

public class Person {
    int number;
    Scanner scanner = new Scanner(System.in);
    Person(){}
    Person(int nomer){
        this.number = nomer;
    }
    public void setNumber(){
        this.number = scanner.nextInt();
    }
    public int getNumber(){
        return number;
    }
    public String getStr(){
        return "Тестовое значение";
    }
    }



