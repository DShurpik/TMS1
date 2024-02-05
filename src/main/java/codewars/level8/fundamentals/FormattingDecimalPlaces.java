package codewars.level8.fundamentals;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {

        //System.out.println(TwoDecimalPlaces(5.5589)); // 5.56
        //System.out.println(TwoDecimalPlaces(3.3424)); // 3.34

        System.out.println(TwoDecimalPlaces1(5.5589)); // 5.56
        System.out.println(TwoDecimalPlaces1(3.3424)); // 3.34


    }

    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100d;
    }

    public static Double TwoDecimalPlaces1(double number) {
        String s = String.format("%.2f ",number).replaceAll(",", ".");
        return Double.parseDouble(s);
    }
}
