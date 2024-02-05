package codewars.level8.fundamentals;

public class HexToDecimal {
    public static void main(String[] args) {
        System.out.println(hexToDec("1"));
        System.out.println(hexToDec("FF"));
        System.out.println(hexToDec("-C"));
    }

    /** Hex to Decimal шестнадцатеричное число (заданное в виде строки) в десятичное число. **/

    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}
