package alishev.abstractaclass.hw12;

public final class Employee extends BaseEmployee{

    public Employee(String name, int age, String gender, int dailySalary) {
        super(name, age, gender, dailySalary);
    }

    @Override
    public int getSalary(Month[] monthsArr) {
        int salary = 0;
        for (Month m : monthsArr) {
            salary += m.getCountWorkDays() * dailySalary;
        }
        return salary;
    }

    @Override
    public int getSalary(Month month) {
        return super.getSalary(month);
    }

    @Override
    public String sayHello() {
        return String.format("I,m %s and my", name) ;
    }

}
