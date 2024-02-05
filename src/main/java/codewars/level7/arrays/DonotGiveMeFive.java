package codewars.level7.arrays;
// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java
public class DonotGiveMeFive {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9)); // 8
        System.out.println(dontGiveMeFive(4, 17)); // 12
        System.out.println(dontGiveMeFive(50, 56));
    }

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (String.valueOf(Math.abs(i)).contains("5")) {
                continue;
            }
            count++;
        }
        return count;
    }
}
