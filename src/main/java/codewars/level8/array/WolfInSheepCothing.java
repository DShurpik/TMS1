package codewars.level8.array;

import java.util.Arrays;
import java.util.Collections;

public class WolfInSheepCothing {
    public static void main(String[] args) {
        System.out.println(warnTheSheep2(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"})); // №2
        System.out.println(warnTheSheep2(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"})); // №5
        System.out.println(warnTheSheep2(new String[]{"sheep", "sheep", "wolf"})); // "Pls go away and stop eating my sheep"
    }

    public static String warnTheSheep(String[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                index = i + 1;
            }
        }
        int finalIndex = array.length - index;
        if (finalIndex != 0) {
            return "Oi! Sheep number " + finalIndex + "! You are about to be eaten by a wolf!";
        } else {
            return "Pls go away and stop eating my sheep";
        }
    }
    public static String warnTheSheep1(String[] array) {
        int wolfN = Arrays.asList(array).indexOf("wolf") + 1;
        return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
    }

    public static String warnTheSheep2(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }
}
