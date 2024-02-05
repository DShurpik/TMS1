package codewars.level8.math;

public class Will_there_be_enough_space {
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
