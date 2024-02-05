package alishev;

import java.util.Arrays;

public class Asd {
    public static void main(String[] args) {
        int array3[][][] = {
                {{1 , 2, 3}, {4,5,6},{7,8,9}},
                {{9,8,7},{6,5,4},{3,2,1}},
                {{1,2,3},{4,5,6},{7,8,9}}
        };
        System.out.println("\n" + "array3[][][] = " + Arrays.deepToString(array3));

        String kkk = Arrays.deepToString(array3);
        System.out.println(kkk);

        String kkk1 = String.valueOf(kkk.split(" "));
        System.out.println(kkk1);
    }
}
