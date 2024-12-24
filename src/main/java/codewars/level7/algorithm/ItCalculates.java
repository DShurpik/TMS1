package codewars.level7.algorithm;

public class ItCalculates {
    public static void main(String[] args) {
        //System.out.println(add(26,39)); // 515
        System.out.println(add(122, 81)); // 1103
        // 1 2 2
        // 0 8 1
    }

    public static int add(int num1, int num2) {
        StringBuilder str1 = new StringBuilder(String.valueOf(num1));
        StringBuilder str2 = new StringBuilder(String.valueOf(num2));
        StringBuilder res = new StringBuilder();
        while (str1.length() > str2.length()) {
            str2.insert(0, '0');
        }
        while (str2.length() > str1.length()) {
            str1.insert(0, '0');
        }
        for (int i = 0; i < str1.length(); i++) {
            res.append(Character.getNumericValue(str1.charAt(i)) + Character.getNumericValue(str2.charAt(i)));
        }
        return Integer.parseInt(res.toString());
    }
}
