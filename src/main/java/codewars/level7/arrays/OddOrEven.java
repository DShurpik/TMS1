package codewars.level7.arrays;

public class OddOrEven {
    //https://www.codewars.com/kata/5949481f86420f59480000e7/train/java

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{1,2,3,4}));
    }

    public static String oddOrEven (int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
