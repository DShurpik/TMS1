package tms.lesson7HomeWork;

public class Cat extends Animal{
    public String eyesColor;

    public void setEyesColor(String eyesColor){
        this.eyesColor = eyesColor;
    }
    public void printVoice(){
        System.out.println("Мяу");
    }

    public String getVoice(){
        return "Мяу";
    }


    public void printInfo() {
        System.out.println("ID " + animalID + " Name " + name + " Data " + data + " Eyescolor "+ eyesColor);
    }
}
