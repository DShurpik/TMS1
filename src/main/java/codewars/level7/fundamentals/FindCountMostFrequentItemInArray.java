package codewars.level7.fundamentals;

public class FindCountMostFrequentItemInArray {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) return 0;
        int maxCount = 1;
        for (int i = 0; i < collection.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < collection.length; j++) {
                if (collection[i] == collection[j]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int result = mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}); // 5
        System.out.println(result);

        int result1 = mostFrequentItemCount(new int[] {3, -1, -1}); // 2
        System.out.println(result1);
    }
}
