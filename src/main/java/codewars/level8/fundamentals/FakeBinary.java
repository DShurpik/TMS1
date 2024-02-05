package codewars.level8.fundamentals;

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin1("45385593107843568")); // "01011110001100111"
        System.out.println(fakeBin1("509321967506747")); // "101000111101101"
        System.out.println(fakeBin1(""));
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }


    public static String fakeBin1(String numberString) {
        String res = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') {
                res += '0';
            } else {
                res += '1';
            }
        }
        return res;
    }
}
