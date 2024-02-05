package codewars.level7.fundamentals;

public class AutomorphicNumber {

    public static String autoMorphic(int number) {
        int temp = number * number;
        String squareStr = Integer.toString(temp);
        String numberStr = Integer.toString(number);
        return squareStr.endsWith(numberStr) ? "Automorphic" : "Not!!";
    }

    public static void main(String[] args) {
        String result = autoMorphic(25);
        String result1 = autoMorphic(225);
        System.out.println(result);
        System.out.println(result1);
    }
}
