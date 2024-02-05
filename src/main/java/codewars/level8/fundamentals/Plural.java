package codewars.level8.fundamentals;

public class Plural {
    //https://www.codewars.com/kata/52ceafd1f235ce81aa00073a/train/java

    public static void main(String[] args) {
        System.out.println(isPlural(1.0f));
        System.out.println(isPlural(1.2f));
    }

    public static boolean isPlural(float f){
        return f != 1.0;
    }
}
