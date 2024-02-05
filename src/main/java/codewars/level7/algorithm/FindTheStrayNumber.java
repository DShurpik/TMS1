package codewars.level7.algorithm;
// https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

public class FindTheStrayNumber {
    public static void main(String[] args) {
        System.out.println(stray(new int[]{1,1,2})); // 2
        System.out.println(stray(new int[]{1, 2, 1})); // 2
        System.out.println(stray(new int[]{17,17,17,17,3,17})); // 3
        System.out.println(stray(new int[]{5,5,6})); // 6

    }


    static int stray(int[] numbers) {
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
        for (int i : numbers) if (i != numbers[0]) return i;
        return 0;
    }

}
