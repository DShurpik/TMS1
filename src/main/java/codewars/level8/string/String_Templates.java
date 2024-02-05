package codewars.level8.string;

public class String_Templates {
    public static void main(String[] args) {
        System.out.println(buildString("Cheese","Milk","Chocolate"));
    }
    public static String buildString(String... args) {
        return String.format("I like %s!", String.join(", ", args));
    }
}
