package codewars.level8.string;

public class Bango {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Adam"));
        System.out.println(areYouPlayingBanjo("Paul"));
        System.out.println(areYouPlayingBanjo("bravo"));
    }
    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
