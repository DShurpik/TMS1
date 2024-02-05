package codewars.level8.array;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

    public static void main(String[] args) {
        SumMixedArray sumMixedArray = new SumMixedArray();
        System.out.println(sumMixedArray.sum(Arrays.asList(5,"5")));
    }

    public int sum1(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object obj : mixed) {
            if (obj instanceof Integer) {
                sum = sum + (int)obj;
            } else if (obj instanceof String){
                sum = sum + Integer.parseInt(obj.toString());
            }
        }
        return sum;
    }
}
