package codewars.level7.fundamentals;

public class EvenOddWhichGreater {

    public static void main(String[] args) {
        System.out.println(evenOrOdd("12"));        // Even is greater than Odd
        System.out.println(evenOrOdd("123"));       // Odd is greater than Even
        System.out.println(evenOrOdd("112"));       // Even and Odd are the same
    }

    public static String evenOrOdd(String str){
        String[] arr = str.split("");
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                sumEven += Integer.parseInt(arr[i]);
            } else {
                sumOdd += Integer.parseInt(arr[i]);
            }
        }
        return sumEven > sumOdd ? "Even is greater than Odd"
                : sumEven < sumOdd ? "Odd is greater than Even" : "Even and Odd are the same";
    }
}
