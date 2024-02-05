package tms.lesson7.Lesson7abstractClass;

public class PersonService {
    public static void main(String[] args) {
        Client client = new Client("Fedor", "Hrust", "bapb");
        client.displayInfo();

        Employee employee = new Employee("Dima", "Klim", "pmc");
        employee.displayInfo();

    }
}
    /**
        Person person = new Person();
        System.out.println("Person 1");
        System.out.println(person.getName());
        System.out.println(person.getSurname());

        Person person2 = new Person("Petr", "Ivanov");
        System.out.println("Person 2");
        System.out.println(person2.getName());
        System.out.println(person2.getSurname());

        Person person3 = new Person("Kolya","Popov");
        System.out.println("Person 3");
        System.out.println(person3.getName());
        System.out.println(person3.getSurname());

        Employee employee = new Employee("Vasya", "Lust", "mtz");
        System.out.println("Employee");
        System.out.println(employee.getName());
        System.out.println(employee.getSurname());

        Employee employee2 = new Employee("Igor", "Juke", "bmw");
        System.out.println("Employee 2");
        employee2.displayInfo();


        // Первый способо вывода
        Employee employee3 = new Employee("Misha", "Frust", "maz");
        System.out.println("Employee 3");
        System.out.println(employee3.getName());
        System.out.println(employee3.getSurname());
        System.out.println(employee3.getCompany());

        // Второй способ вывода (Переопределение из класса Employee)
        Employee employee4 = new Employee("Fedor", "Hrust", "naftan");
        System.out.println("Employee 4");
        employee4.displayInfo();
    }
} **/
