package codewars.level7.strings;
// https://www.codewars.com/kata/5668e3800636a6cd6a000018/train/java
public class Ghostbusters {
    public static void main(String[] args) {
        System.out.println(ghostBusters("O  f fi ce"));
        System.out.println(ghostBusters("Factor y"));
        System.out.println(ghostBusters("BusStation")); // "You just wanted my autograph didn't you?"
    }

    public static String ghostBusters(String building) {
        return !building.matches(".*\\s.*") ? "You just wanted my autograph didn't you?" : building.replaceAll(" ", "");
    }

    public static String ghostBusters1(String building) {
        return building.contains(" ") ? building.replace(" ", "") : "You just wanted my autograph didn't you?";
    }
}
