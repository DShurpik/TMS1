package codewars.level7.strings;

public class HelpFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null) return new String[]{};
        String[] res = new String[fruitBasket.length];
        for (int i = 0; i < fruitBasket.length; i++) {
            res[i] = fruitBasket[i].replace("rotten", "").toLowerCase();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] res = removeRotten(new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"});
        for (String s : res) {
            System.out.println(s);
        }
    }
}
