package codewars.level8.math;
/** https://www.codewars.com/kata/57202aefe8d6c514300001fd */
public class TrainingJSIfElse {
    public static void main(String[] args) {
        System.out.println(saleHotdogs(10));
        System.out.println(saleHotdogs(51));
        System.out.println(saleHotdogs(101));
    }
    public static int saleHotdogs(final int n){
        int totalPrice;
        int price;
        if( n < 5) {
            price = 100;
            totalPrice = price * n;
        } else if (n >= 5 && n < 10) {
            price = 95;
            totalPrice = price * n;
        } else {
            price = 90;
            totalPrice = price * n;
        }
        return totalPrice;
    }
}
