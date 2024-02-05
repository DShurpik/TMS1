package codewars.level7.arrays;

public class AveragesOfNumbers {
    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return new double[0];
        }

        double[] res = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            res[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        double[] res = averages(new int[] { 1, 3, 5, 1, -10 });
        for (double d : res) {
            System.out.print(d + " ");
        }
    }
}
