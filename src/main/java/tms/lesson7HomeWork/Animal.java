package tms.lesson7HomeWork;

import java.util.Date;

public abstract class Animal {
    protected int animalID;
    protected String name;
    protected Date data;

    //реализация через методы

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public abstract void printVoice();
    public abstract String getVoice();

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public abstract void printInfo();
}
