package tms.lesson7;

public class Employee extends Person{

    private String company;


    public Employee(String inputParamName, String inputParamSurname, String inputCompany){
        super(inputParamName, inputParamSurname);
        company = inputCompany;
    }

    public String getCompany() {
        return company;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: " + name + " Surname: " + surname + " Company: " + company);
    }
}
