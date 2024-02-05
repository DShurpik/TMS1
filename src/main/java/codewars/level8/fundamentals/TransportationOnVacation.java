package codewars.level8.fundamentals;

public class TransportationOnVacation {

    public static void main(String[] args) {
        System.out.println(rentalCarCost(1));
        System.out.println(rentalCarCost(3));
        System.out.println(rentalCarCost(5));
        System.out.println(rentalCarCost(7));
        System.out.println(rentalCarCost(9));
    }

    public static int rentalCarCost(int d) {
        return d < 3 ? (d * 40) : d < 7 ? (d * 40 - 20) : (d * 40 - 50);

        /**if (d < 3) {
            sum = d * 40;
        } else if (d < 7) {
            sum = d * 40 - 20;
        } else {
            sum = d * 40 - 50;
        }
        return sum;**/
    }
}
