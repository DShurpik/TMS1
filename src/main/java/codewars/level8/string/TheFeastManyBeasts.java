package codewars.level8.string;

public class TheFeastManyBeasts {

    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","dear claw"));
    }


    public static boolean feast(String beast, String dish) {
        // вид животного и блюдо должны начинаться и заканчиваться с одинаковых букв

        char firstLetter = beast.charAt(0);
        char lastLetter = beast.charAt(beast.length() - 1);
        return dish.charAt(0) == firstLetter && dish.charAt(dish.length() - 1) == lastLetter;
    }
}
