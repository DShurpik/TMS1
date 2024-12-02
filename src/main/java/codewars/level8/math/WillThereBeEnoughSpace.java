package codewars.level8.math;

public class WillThereBeEnoughSpace {
    public static void main(String[] args) {
        System.out.println(enough(10,5,5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }
    public static int enough(int cap, int on, int wait){
        if (cap - on - wait < 0) return Math.abs(cap - on - wait);
        return 0;
    }
}
