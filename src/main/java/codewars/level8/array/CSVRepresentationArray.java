package codewars.level8.array;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class CSVRepresentationArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 } };
        String res = toCsvText(arr);

        System.out.println(res);
    }

    public static String toCsvText(int[][] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length - 1 != j) {
                    stringBuilder.append(array[i][j]).append(",");
                } else {
                    stringBuilder.append(array[i][j]);
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString().trim();
    }

    static String toCsvText1(int[][] array) {
        return stream(array)
                .map(r -> stream(r)
                .mapToObj(i -> i + "")
                .collect(joining(",")))
                .collect(joining("\n"));
    }
}
