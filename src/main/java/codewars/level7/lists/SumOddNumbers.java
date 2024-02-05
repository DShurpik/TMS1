package codewars.level7.lists;
// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

import java.util.ArrayList;

public class SumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(2)); // 8
        System.out.println(rowSumOddNumbers(3)); // 27
        System.out.println(rowSumOddNumbers(4)); // 64
    }

    public static int rowSumOddNumbers(int n) {
        ArrayList <Integer>list = new ArrayList<>(n * (n - 1));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list.add(n * (n - 1)  + n);
            sum = sum + list.get(i);
        }
        return sum;
    }
}
