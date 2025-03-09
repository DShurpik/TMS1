package codewars.level7.mathematics;

public class BoiledEggs {
    public static void main(String[] args) {
        System.out.println(cookingTime(5)); // 5
        System.out.println(cookingTime(8)); // 5
        System.out.println(cookingTime(10)); // 10
    }

    public static int cookingTime(int eggs){
        int res = (int) Math.ceil(eggs / 8.0);
        if (eggs <= 8) return 5;
        return res * 5;
    }
}
