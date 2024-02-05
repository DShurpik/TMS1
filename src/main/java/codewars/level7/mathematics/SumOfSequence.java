package codewars.level7.mathematics;
// https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
public class SumOfSequence {
    public static void main(String[] args) {
        System.out.println(sequenceSum(2,  6, 2)); // 12
        System.out.println(sequenceSum(0, 15, 3)); // 45
        System.out.println(sequenceSum(16, 15, 3)); // 0
    }

    public static int sequenceSum(int start, int end, int step) {
        if (end - start < 0) return 0;
        int sum = 0;
        for (int i = start; i <= end; ) {
            sum = sum + i;
            i = i + step;
        }
        return sum;
    }
}
