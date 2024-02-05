package codewars.level7.fundamentals;

import java.util.ArrayList;

// https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
public class NumberPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list)); // 5
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int count = 0;
        for (int[] array : stops) {
            for (int i = 0; i < 2; i++) {
                if(i == 0) {
                    count = count + array[i];
                } else {
                    count = count - array[i];
                }
            }
        }
        return count;
    }
}
