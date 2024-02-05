package codewars.level8.array;

public class How_good_are_you_better {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));//true
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));//true
        System.out.println(betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));//true
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));//false
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        int avg = sum / classPoints.length;
        return avg > yourPoints ? false : true;
    }
}
