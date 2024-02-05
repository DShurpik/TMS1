package codewars.level7.fundamentals;
// https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
public class MakeFunctionThatDoesArithmetic {
    public static void main(String[] args) {
        System.out.println(arithmetic(1, 2, "add")); // 3
        System.out.println(arithmetic(8, 2, "subtract")); // 6
        System.out.println(arithmetic(5, 2, "multiply")); // 10
        System.out.println(arithmetic(8, 2, "divide")); // 4
    }

    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add" : return a + b;
            case "subtract" : return a - b;
            case "multiply" : return a * b;
            case "divide" : return a / b;
        }
        return 0;
    }
}
