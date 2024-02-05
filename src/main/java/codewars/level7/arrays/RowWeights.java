package codewars.level7.arrays;
// https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9/train/java

public class RowWeights {
    public static void main(String[] args) {
        int[] arr = rowWeights(new int[]{50,60,70,80});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] rowWeights (final int[] weights) {
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeam = firstTeam + weights[i];
            } else {
                secondTeam = secondTeam + weights[i];
            }
        }
        return new int[]{firstTeam, secondTeam};
    }
}
