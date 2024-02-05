package codewars.level7.arrays;

public class TheOfficeBoredomScore {
    public static String boredom(Person[] staff) {
        int sum = 0;
        for (Person person : staff) {
            switch (person.department) {
                case "accounts" : sum = sum + 1; break;
                case "finance" : sum = sum + 2; break;
                case "canteen" : sum = sum + 10; break;
                case "regulation" : sum = sum + 3; break;
                case "trading" : sum = sum + 6; break;
                case "change" : sum = sum + 6; break;
                case "IS" : sum = sum + 8; break;
                case "retail" : sum = sum + 5; break;
                case "cleaning" : sum = sum + 4; break;
                case "pissing about" : sum = sum + 25; break;
            }
        }
        return (sum <= 80) ? "kill me now" : ((sum > 80 && sum < 100) ? "i can handle this" : "party time!!");
    }


    public static void main(String[] args) {
        String result = boredom(new Person[] {
                new Person("tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance")
        });

        System.out.println(result);
    }
}

