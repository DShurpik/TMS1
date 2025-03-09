package alishev.abstractaclass.hw12;

public class Manager extends BaseEmployee{
    private final double bonus = 0.01;
    private final int countEmployee;

    public Manager(String name, int age, String gender, int dailySalary, int countEmployee){
        super(name, age, gender, dailySalary);
        this.countEmployee = countEmployee;
    }

    @Override
    public int getSalary(Month[] monthsArr) {
        int salary = 0;
        for (Month month : monthsArr) {
            salary += month.getCountWorkDays() * dailySalary;
        }
        return (int) (salary + salary * countEmployee * bonus);
    }

    @Override
    public int getSalary(Month month) {
        int salary = super.getSalary(month);
        return (int) (salary + salary * countEmployee * bonus);
    }

    @Override
    public String sayHello() {
        return String.format("I,m %s and work as %s and my", name, this.getClass().getName());
    }
}
