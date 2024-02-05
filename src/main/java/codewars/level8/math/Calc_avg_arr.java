package codewars.level8.math;

public class Calc_avg_arr {
    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 2, 3}));
    }
    public static double find_average(int[] array){
        if (array == null) return 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/array.length;
    }
}
