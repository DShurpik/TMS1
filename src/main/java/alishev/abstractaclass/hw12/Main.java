package alishev.abstractaclass.hw12;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack", 30, "M", 100);
        System.out.println(employee.sayHello() + " january salary is: " + employee.getSalary(MonthUtils.JANUARY));
        System.out.println(employee.sayHello() + " q1 salary is: " + employee.getSalary(MonthUtils.q1));
        System.out.println("-----------------------------------------------------------------------");
        Manager manager = new Manager("Michael", 40, "M", 100, 1);
        System.out.println(manager.sayHello() + " january salary is: " + manager.getSalary(MonthUtils.JANUARY));
        System.out.println(manager.sayHello() + " q1 salary is: " + manager.getSalary(MonthUtils.q1));
        System.out.println("-----------------------------------------------------------------------");
        Director director = new Director("John", 50, "M", 100, 1);
        System.out.println(director.sayHello() + " january salary is: " + director.getSalary(MonthUtils.JANUARY));
        System.out.println(director.sayHello() + " q1 salary is: " + director.getSalary(MonthUtils.q1));
        System.out.println("-----------------------------------------------------------------------");

        BaseEmployee[] baseEmployees = {
                employee, manager, director
        };
        System.out.println(baseEmployees[2].getSalary(MonthUtils.JANUARY));
        director.hi();
        // Так не работает, т.к рассматривает director через абстракцию BaseEmployee
        //baseEmployees[2].hi();
        // НО через каст работает!!!
        ((Director) baseEmployees[2]).hi();
        System.out.println("-----------");
        Director[] baseEmployees1 = {
                director
        };
        System.out.println(baseEmployees1[0].getSalary(MonthUtils.JANUARY));
        director.hi();
        baseEmployees1[0].hi();
    }
}
