package codewars.level8.string;

public class ReturningStrings {
    public static void main(String[] args) {
        System.out.println(greet("Ryan"));
    }
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static String greet1(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}
