package codewars.level7.algorithm;

public class PalindromeChainLength {

    public static int palindromeChainLength (long n) {
        int count = 0;
        while (true) {
            String strNumber = Long.toString(n);
            String reversedStr = new StringBuilder(strNumber).reverse().toString();
            long reversedNumber = Long.parseLong(reversedStr);

            if (isPalindrome(strNumber)) {
                return count;
            }
            n += reversedNumber;
            count++;
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int i = palindromeChainLength(2897); // 7
        System.out.println(i);
    }


}
