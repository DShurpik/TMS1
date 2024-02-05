package codewars.level8.string;

public class Bin_to_Decimal {
    public static void main(String[] args) {
        System.out.println(binToDecimal("1"));
        System.out.println(binToDecimal("0"));
        System.out.println(binToDecimal("1001001"));
    }

    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }
}
