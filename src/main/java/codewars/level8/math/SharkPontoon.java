package codewars.level8.math;

public class SharkPontoon {
    public static void main(String[] args) {
        System.out.println(shark(12, 50, 4, 8, true));
        System.out.println(shark(24, 0, 4, 8, true));
    }

    public static String shark(int pontoonDistance, int sharkDistance, int youSpeed,
                               int sharkSpeed, boolean dolphin) {
        if(pontoonDistance/youSpeed < sharkDistance/sharkSpeed){
            return "Alive!";
        }else if (dolphin == true && pontoonDistance/youSpeed < sharkDistance/(0.5*sharkSpeed)){
            return "Alive!";
        }else{
            return "Shark Bait!";
        }
    }
}
