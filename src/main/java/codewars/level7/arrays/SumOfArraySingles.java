package codewars.level7.arrays;
// https://www.codewars.com/kata/59f11118a5e129e591000134/train/java

public class SumOfArraySingles {
    public static void main(String[] args) {
        System.out.println(repeats(new int []{4,5,7,5,4,8})); // 15
    }

    public static int repeats(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isSingle = false;
                    break;
                }
            }
            if (isSingle) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
