package codewars.level8.fundamentals;

import java.util.Arrays;

public class KataExampleTwist {


    public static void main(String[] args) {

    }

    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];
        for (int i = 0; i < websites.length; i++) {
            websites[i] = "codewars";
        }
        return websites;
    }

    public static String[] kataExampleTwist1()
    {
        String[] websites = new String[1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }
}
