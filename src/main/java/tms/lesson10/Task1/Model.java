package tms.lesson10.Task1;

public class Model {
    int nomer;

    Model(){}
    Model(int nomer){
        this.nomer = nomer;
    }
    public void setNomer(int number){
        this.nomer = number;
    }
    public int getNomer(){
        return nomer;
    }
    public String getString(){
        return "Тестовое значение";
    }
}
