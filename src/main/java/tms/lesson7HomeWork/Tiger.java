package tms.lesson7HomeWork;

public class Tiger extends Cat {
    public int eatsEmployee;


    public void seteatsEmployee(int eatsEmployee){
        this.eatsEmployee = eatsEmployee;
    }

    public void printVoice(){
        System.out.println("Р-р-р-р");
    }
    public String getVoice(){
        return "Р-р-р-р";
    }

    public void printInfo() {
        System.out.println("ID " + animalID + " Name " + name + " Data " + data + " Eats employee "+ eatsEmployee);
    }
}
