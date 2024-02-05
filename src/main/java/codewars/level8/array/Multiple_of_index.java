package codewars.level8.array;

public class Multiple_of_index {
    public static void main(String[] args) {
        int[] arr1 = new int[]{68, -1, 1, -7, 10, 10};
        int[] arr2 = new int[]{22, -6, 32, 82, 9, 25};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            try {
                if(arr2[i] % i == 0) {
                    count++;
                }
            } catch (Exception e){}
        }
        System.out.println(count);
        int[] arr3 = new int[count];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            try {
                if (arr2[i] % i == 0) {
                    arr3[j] = arr2[i];
                    j++;
                }
            } catch (Exception e){}
        }
    }
    public static int[] multipleOfIndex(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                if(array[i] % i == 0) {
                    count++;
                }
            } catch (Exception e){}
        }
        int[] arr3 = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] % i == 0) {
                    arr3[j] = array[i];
                    j++;
                }
            } catch (Exception e){}
        }
        return arr3;
    }
}
