package codewars.level8.array;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-4,7,12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum); // 20
    }
}
