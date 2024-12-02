package codewars.level8.array;

public class CreateArrWithStepAndLong {
    public static void main(String[] args) {
        int x = 3; //step
        int n = 7; //lenght
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x * (i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
