package codewars.level7.arrays;

public class EvensTimesLast {
    public static void main(String[] args) {
        System.out.println(evenLast(new int[]{2, 3, 4, 5})); // 30
        System.out.println(evenLast(new int[]{1, 3, 3, 1, 10})); // 140
    }

    public static int evenLast(int[] numbers){
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i = i + 2) {
            sum += numbers[i];
        }
        return sum * numbers[numbers.length - 1];
    }
}
