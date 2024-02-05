package tms.lesson7HomeWork;

public class Dog extends Animal{

    public double weight;

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void printVoice(){
        System.out.println("Гав");
    }
    public String getVoice(){
        return "Гав";
    }
    public void printInfo() {
        System.out.println("ID " + animalID + " Name " + name + " Data " + data + " Weight " + weight);
    }

}
