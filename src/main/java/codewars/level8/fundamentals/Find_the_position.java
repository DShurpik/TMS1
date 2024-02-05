package codewars.level8.fundamentals;

public class Find_the_position {
    public static void main(String[] args) {
        System.out.println(position('a')); // 1
        System.out.println(position('z')); // 26
        System.out.println(position('e')); // 5
    }

    public static String position(char alphabet) {
        int res = (int) alphabet - 96;
        return "Position of alphabet: " + Integer.toString(res);
    }
}
