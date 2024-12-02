package codewars.level8.array;

import java.util.Arrays;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[] {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true
        };

        System.out.println(count(arr));
        System.out.println(countSheeps(arr));
    }

    public static int count(Boolean[] arr) {
        return Arrays.stream(arr).filter(x -> x != null).filter(x -> x == true).toArray().length;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i])
                count++;
        }
        return count;
    }
}
