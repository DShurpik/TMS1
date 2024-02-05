package codewars.level8.array;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class PrintingArrayElementsWithCommaDelimiters {
    public static void main(String[] args) {
        System.out.println(printArray(new Integer[]{2,4,5,2}));

        System.out.println(printArray1(new Integer[]{2,3,4,5,6,7,8}));
    }

    public static String printArray(Object array[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1) {
                stringBuilder.append(array[i].toString());
            } else {
                stringBuilder.append(array[i].toString()).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static String printArray1(Object[] array) {
        return Stream.of(array).map(Object::toString).collect(joining(","));
    }
}
