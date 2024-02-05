package tms.lesson9;

public class TestModel {
    public String name;

    public String getConstName(){
        return "Vasya";
    }

    public String setName(String name){
        this.name = name;
        return this.name;

    }
    public void displayInfo(String pre){
        System.out.println();
    }
}
