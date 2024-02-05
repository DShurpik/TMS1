package codewars.level7.mathematics;

// https://www.codewars.com/kata/55afed09237df73343000042/train/java
public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(isLucky(1892376)); // true
        System.out.println(isLucky(189237)); // false
        System.out.println(isLucky(0)); // true
    }

    public static boolean isLucky(long n) {
        int sum = 0;
        String longString = Long.toString(n);
        for (int i = 0; i < longString.length(); i++) {
            sum = sum + Character.getNumericValue(longString.charAt(i));
        }
        return sum % 9 == 0 || sum == 0;
    }

}
