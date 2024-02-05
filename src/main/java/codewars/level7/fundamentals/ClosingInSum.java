package codewars.level7.fundamentals;

// https://www.codewars.com/kata/65126d52a5de2b11c94096d2/train/java
public class ClosingInSum {
    public static void main(String[] args) {
        System.out.println(closingInSum(22225555)); // 100
        System.out.println(closingInSum(121)); // 13
        System.out.println(closingInSum(1039L));// 22
        System.out.println(closingInSum(1234)); // 37
    }

    public static int closingInSum(long n) {
        int sum = 0;
        String numberString = Long.toString(n);
        char[] digitArray = numberString.toCharArray();
        int[] intArray = new int[digitArray.length];
        for (int i = 0; i < digitArray.length; i++) {
            intArray[i] = Character.getNumericValue(digitArray[i]);
        }
        int middle = intArray.length / 2;
        if (intArray.length % 2 == 0) {
            for (int i = 0; i < intArray.length / 2; i++) {
                sum = sum + (intArray[i] * 10 + intArray[intArray.length - 1 - i]);
            }
        } else {
            for (int i = 0; i < intArray.length / 2; i++) {
                sum = sum + (intArray[i] * 10 + intArray[intArray.length - 1 - i]);
            }
            sum = sum + intArray[middle];
        }
        return sum;
    }
}
