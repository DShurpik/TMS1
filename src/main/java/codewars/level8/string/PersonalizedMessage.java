package codewars.level8.string;

public class PersonalizedMessage {
    public static void main(String[] args) {
        System.out.println(greet("Daniel", "Daniel"));
        System.out.println(greet("Greg", "Daniel"));
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
