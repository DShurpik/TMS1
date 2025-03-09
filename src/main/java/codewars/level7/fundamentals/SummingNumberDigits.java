package codewars.level7.fundamentals;

public class SummingNumberDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(-123)); // 6
    }

    public static int sumDigits(int number){
        if (number < 0) number = number * -1;
        String[] arr = String.valueOf(number).split("");
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Integer.parseInt(arr[i]);
        }
        return res;
    }
}
