package codewars.level7.strings;
// https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java

public class BumpsInTheRoad {
    public static void main(String[] args) {
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn")); // "Woohoo!"
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn")); // "Car Dead"
        System.out.println(bumps("nnn_n__n_n___nnnnn___n__nnn__")); // "Woohoo!"
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn")); // "Woohoo!"
    }

    public static String bumps(final String road) {
        int count = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                count++;
            }
        }
        return count <= 15 ? "Woohoo!" : "Car Dead";
    }
}
