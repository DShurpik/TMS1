package codewars.level8.math;

public class TwiceAndOld {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,0));//30
        System.out.println(TwiceAsOld(30,7));//16
        System.out.println(TwiceAsOld(45,30));//15
    }
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs(2 * sonYears - dadYears);
    }
}
