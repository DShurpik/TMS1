package codewars.level8.oop;

import java.util.Random;

public class Ghost {

    private String color;

    public Ghost() {
        String[] arr = new String[] {"white", "yellow", "purple", "red"};
        Random random = new Random();
        int index = random.nextInt(arr.length);
        this.color = arr[index];
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
    }
}
