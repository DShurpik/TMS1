package codewars.level7.fundamentals;

public class ElevatorDistance {
    public static void main(String[] args) {
        System.out.println(elevatorDistance(new int[]{5, 2, 8})); // 9
        System.out.println(elevatorDistance(new int[]{7, 1, 7, 1})); // 18
        System.out.println(elevatorDistance(new int[]{1, 2, 3})); // 2
    }

    public static int elevatorDistance(int[] arr){
        int sum = 0;
        if (arr[0] == arr[1]) return 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        return sum;
    }
}
