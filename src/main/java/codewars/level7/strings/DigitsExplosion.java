package codewars.level7.strings;

public class DigitsExplosion {

    public static String explode1(String digits) {
        String result = "";
        for (int i = 0; i < digits.length(); i++) {
            String temp = String.valueOf(digits.charAt(i));
            result = result + temp.repeat(Integer.valueOf(temp));
        }
        return result;
    }
    public static String explode(String digits) {
        String result = digits.replaceAll("2", "22")
                .replaceAll("3", "333")
                .replaceAll("4", "4444")
                .replaceAll("5", "55555")
                .replaceAll("6", "666666")
                .replaceAll("7", "7777777")
                .replaceAll("8", "88888888")
                .replaceAll("9", "999999999")
                .replaceAll("0", "");
        return result;
    }

    public static void main(String[] args) {
        String result = explode("312");
        String result1 = explode1("312");
        System.out.println(result);
        System.out.println(result1);
    }
}
