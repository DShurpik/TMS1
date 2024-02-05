package codewars.level7.arrays;

public class SimpleConsecutivePairs {
    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i = i + 2){
            if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = solve(new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94});
        System.out.println(i); // 2
    }
}
