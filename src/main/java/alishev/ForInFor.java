package alishev;

import java.util.Arrays;

public class ForInFor {
    public static void main(String[] args) {
        for (int i =0; i < 5; i++){
            System.out.print(i + "|");
            for (int j = 0; j < 5; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        // Поиск элемента массива по значению 
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++){
            if(array[i] == 4 ){
                System.out.println("\n" + "found 4: index = " + i + " value = " + array[i]);
                break;
            }
        }
        // приведение массива к типу стринг и распечатка массива
        System.out.println(Arrays.toString(array));

        int [] array2 = new int[10];
        for (int i = 0; i < array2.length; i++){
            array2[i] = i + 1;

        }
        System.out.print("\n" + Arrays.toString(array2) + " ");

        int array3[][][] = {
                {{1 , 2, 3}, {4,5,6},{7,8,9}},
                {{9,8,7},{6,5,4},{3,2,1}},
                {{1,2,3},{4,5,6},{7,8,9}}
        };
        System.out.println("\n" + "array3[][][] = " + Arrays.deepToString(array3));


    }
}
