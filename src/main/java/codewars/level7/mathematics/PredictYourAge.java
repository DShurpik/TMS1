package codewars.level7.mathematics;
// https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java

public class PredictYourAge {
    public static void main(String[] args) {
        System.out.println(predictAge(65,60,75,55,60,63,64,45)); // 86
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] arr = new int[] {age1, age2, age3, age4, age5, age6, age7, age8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] * arr[i] + sum;
        }
        int result = (int) Math.sqrt(sum) / 2;
        return result;
    }
}
