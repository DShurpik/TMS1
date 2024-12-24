package codewars.level7.mathematics;

public class JumpingNumber {
    public static void main(String[] args) {
        System.out.println(jumpingNumber(9));
        System.out.println(jumpingNumber(23));
        System.out.println(jumpingNumber(43));
        System.out.println(jumpingNumber(8987));
        System.out.println(jumpingNumber(8986));
    }

    public static String jumpingNumber(int number) {
        String[] arr = String.valueOf(number).split("");
        if (arr.length == 1) return "Jumping!!";
        for (int i = 0; i < arr.length - 1; i++) {
            int first = Integer.parseInt(arr[i]);
            int second = Integer.parseInt(arr[i + 1]);
            if (Math.abs(first - second) != 1) return "Not!!";
        }
        return "Jumping!!";
    }
}
