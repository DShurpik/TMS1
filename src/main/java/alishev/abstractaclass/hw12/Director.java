package alishev.abstractaclass.hw12;

public final class Director extends BaseEmployee {
    private final double bonus = 0.03;
    private final int countEmployee;

    public Director(String name, int age, String gender, int dailySalary, int countEmployee) {
        super(name, age, gender, dailySalary);
        this.countEmployee = countEmployee;
    }

    public void hi() {
        System.out.println("Hi");
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
        return String.format("I,m %s and I'm a director and my", name);
    }
}
