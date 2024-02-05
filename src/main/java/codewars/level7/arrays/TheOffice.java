package codewars.level7.arrays;

public class TheOffice {

    public static String outed(Person[] meet, String boss) {
        double count = 0;
        for(Person person : meet) {
            count = count + person.happiness;
            if(person.name.equals(boss)) count = count + person.happiness;
        }
        return (count/meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }

    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        String result = outed(meet, "laura");
        System.out.println(result);
    }
}
class Person {
    String name;    // team memnber's name
    int happiness;  // happiness rating out of 10
    String department;

    Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    Person(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
