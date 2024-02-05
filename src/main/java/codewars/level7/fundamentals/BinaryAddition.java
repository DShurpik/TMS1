package codewars.level7.fundamentals;
// https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java
public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1)); // 10
        System.out.println(binaryAddition(2, 2)); // 100
        System.out.println(binaryAddition(51, 12)); // 111111
    }

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }
}
