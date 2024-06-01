package codewars.level7.fundamentals;

public class NthPowerRulesThem {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        int i = modifiedSum(arr, 3);
        System.out.println(i);
    }

    public static int modifiedSum(int[] array, int power) {
        int sum1 = 0;
        for (int i : array) {
            sum1 += i;
        }
        int sum2 = 0;
        for (int i: array) {
            sum2 = sum2 + (int) Math.pow(i, power);
        }

        return sum2 - sum1;
    }
}
