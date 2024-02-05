package codewars.level7.arrays;

public class SmallestValueOfArray {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        if (toReturn.equals("index")) {
            return minIndex;
        } else {
            return minValue;
        }
    }

    public static void main(String[] args) {
        int res = findSmallest(new int [] {7, 12, 3, 2, 27}, "index");
        int res1 = findSmallest(new int [] {7, 12, 3, 2, 27}, "value");
        System.out.println(res);
        System.out.println(res1);
    }
}
