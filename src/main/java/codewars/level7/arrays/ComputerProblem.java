package codewars.level7.arrays;

public class ComputerProblem {
    public static void main(String[] args) {
        System.out.println(save(new int[]{4, 4, 4, 3, 3}, 12)); // 3
        System.out.println(save(new int[]{4, 4, 4, 3, 3}, 11)); // 2
        System.out.println(save(new int[]{11, 13, 15, 17, 19}, 8)); // 0
    }

    public static int save(int[] sizes, int hd) {
        int sum = 0;
        int count = 0;
        for (int i : sizes) {
            sum += i;
            if (sum <= hd) {
                count++;
            } else break;
        }
        return count;
    }
}
