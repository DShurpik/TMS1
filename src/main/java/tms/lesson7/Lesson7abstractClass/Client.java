package tms.lesson7.Lesson7abstractClass;

public class Client extends Person{
    private String bank;

    public Client(String inputParamName, String inputParamSurname, String inputBank){
        super(inputParamName, inputParamSurname);
        this.bank = inputBank;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + " Surname: " + surname + " Bank: " + bank);
    }
}
