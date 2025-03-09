package alishev.abstractaclass.hw12;

public abstract class BaseEmployee {
    protected final String name;
    protected final int age;
    protected final String gender;
    protected final int dailySalary;

    public BaseEmployee(String name, int age, String gender, int dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public abstract int getSalary(Month[] monthsArr);

    //public abstract int getSalary(Month month);

    public int getSalary(Month month) {
        return month.getCountWorkDays() * dailySalary;
    }

    public abstract String sayHello();

    public String getName() {
        return name;
    }
}
