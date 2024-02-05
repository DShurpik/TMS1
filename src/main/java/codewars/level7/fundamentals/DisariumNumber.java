package codewars.level7.fundamentals;

public class DisariumNumber {
    public static String disariumNumber(int number) {
        int sum = 0;
        String numberString = Integer.toString(number);
        int[] arr = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            arr[i] = Character.getNumericValue(numberString.charAt(i));
        }
        for (int i = 0; i < arr.length; i++) {
            int exponent = i + 1;
            sum = sum + (int) Math.pow(arr[i], exponent);
        }
        return sum == number ? "Disarium !!" : "Not !!";
    }

    public static void main(String[] args) {
        String result = disariumNumber(89);
        String result1 = disariumNumber(589);
        System.out.println(result);
        System.out.println(result1);
    }
}
