package codewars.level8.math;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        /** Посчитать в массиве количество положительных и сумму отрицательных, и вернуть в виде массива*/
    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] arr = new int[2];
        int count = 0;
        int sum = 0;
        if (input == null || input.length == 0) return new int[]{};
        for (int i: input){
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        arr[0] = count;
        arr[1] = sum;
        return arr;
    }
}
