package alishev.interfaces;

public class Animal implements Info{

    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println(" i am sleeping");
    }

    @Override
    public void printInfo() {
        System.out.println(id);
    }
}
