package codewars.level7.mathematics;

public class BalancedNumber {
    public static String balancedNum(long number) {
        String temp = Long.toString(number);
        String[] arr = temp.split("");
        if (temp.length() == 1 || temp.length() == 2) return "Balanced";
        int sumLeft = 0;
        int sumRight = 0;
        if (temp.length() % 2 == 0) {
            int middle = temp.length() / 2 - 1;
            int middle1 = middle + 1;
            for (int i = 0; i < middle; i++) {
                sumLeft = sumLeft + Integer.parseInt(arr[i]);
            }
            for (int i = arr.length - 1; i > middle1; i--) {
                sumRight = sumRight + Integer.parseInt(arr[i]);
            }
            return sumLeft == sumRight ? "Balanced" : "Not Balanced";
        }
        int middle = temp.length() / 2;
        for (int i = 0; i < middle; i++) {
            sumLeft = sumLeft + Integer.parseInt(arr[i]);
        }
        for (int i = arr.length - 1; i > middle; i--) {
            sumRight = sumRight + Integer.parseInt(arr[i]);
        }
        return sumLeft == sumRight ? "Balanced" : "Not Balanced";
    }

    public static void main(String[] args) {
        String result = balancedNum(12); // balanced
        String result1 = balancedNum(432); // "Not Balanced"
        String result2 = balancedNum(56239814); // balanced
        String result3 = balancedNum(1230987); // "Not Balanced"
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
