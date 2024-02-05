package codewars.level7.strings;
// https://www.codewars.com/kata/535474308bb336c9980006f2/train/java

public class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("riley")); // "Hello Riley!"
    }

    public static String greet(String name){
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                stringBuilder.append(Character.toUpperCase(name.charAt(i)));
            } else {
                stringBuilder.append(Character.toLowerCase(name.charAt(i)));
            }
        }
        return stringBuilder.append('!').toString();
    }

    public static String greet1(String name){
        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
