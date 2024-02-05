package codewars.level7.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://www.codewars.com/kata/5a092d9e46d843b9db000064/train/java
public class ArrayElementParity {
    public static void main(String[] args) {
        System.out.println(solve(new int [] {1,-1,2,-2,3})); // 3
        System.out.println(solve(new int [] {-3,1,2,3,-1,-4,-2})); // -4
        System.out.println(solve(new int [] {1,-1,2,-2,3,3})); // 3
        System.out.println("----");
        System.out.println(solve2(new int [] {1,-1,2,-2,3})); // 3
        System.out.println(solve2(new int [] {-3,1,2,3,-1,-4,-2})); // -4
        System.out.println(solve1(new int [] {1,-1,2,-2,3,3})); // 3
    }

    public static int solve(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] + arr[j] == 0)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return 0;
    }

    public static int solve1(int [] arr){
        return Arrays.stream(arr).distinct().sum();
    }

    public static int solve2(int[] arr) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.add(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
