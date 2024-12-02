package codewars.level8.array;

public class DuckDuckDuckGoose {
    public static void main(String[] args) {
        System.out.println(duckDuckGoose(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"}, 1));
    }
    public static String duckDuckGoose(Object[] players, int goose) {
        Object str = players[(goose - 1) % players.length];
        return str.toString();
    }



}
