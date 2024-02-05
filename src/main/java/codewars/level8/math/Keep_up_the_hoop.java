package codewars.level8.math;
/** https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145 */
public class Keep_up_the_hoop {
    public static void main(String[] args) {
        System.out.println(hoopCount(5));
        System.out.println(hoopCount(11));
    }
    public static String hoopCount(int n){
        return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }
}
