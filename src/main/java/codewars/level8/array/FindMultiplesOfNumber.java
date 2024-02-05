package codewars.level8.array;

import java.util.ArrayList;

public class FindMultiplesOfNumber {
    public static void main(String[] args) {
        int[] arr = find(5, 25);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int[] find(int base, int limit) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = base; i <= limit; i++) {
            if (i % base == 0) {
                arrayList.add(i);
            }
        }
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        return intArray;
    }

    public static int[] find1(int base, int limit) {
        int[] result = new int[limit / base];
        for (int i = base, n = 0;  i <= limit; i+= base, n++) { result[n] = i;}
        return result;
    }
}
