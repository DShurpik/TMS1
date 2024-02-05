package codewars.level7.fundamentals;
// https://www.codewars.com/kata/566fc12495810954b1000030/train/java


public class CountTheDigit {
    public static void main(String[] args) {
        System.out.println(nbDig(11549, 1)); // 11905
        System.out.println(nbDig(11011, 2)); // 9481
        System.out.println(nbDig(5750, 0)); // 4700
        System.out.println(nbDig(12224, 8)); // 7733
    }

    public static int nbDig(int n, int d) {
        int count = 0;
        for (int k = 0; k <= n; k++) {
            int square = k * k;
            String squareStr = Integer.toString(square);
            char digitChar = (char) (d + '0');
            count += countOccurrences(squareStr, digitChar);
        }
        return count;
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
