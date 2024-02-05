package codewars.level7.fundamentals;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        Double Result = null;
        switch (operation) {
            case "+" : return Result = numberOne + numberTwo;
            case "-" : return Result = numberOne - numberTwo;
            case "*" : return Result = numberTwo == 0 ? 0.0 : numberOne * numberTwo;
            case "/" : return Result = numberTwo != 0 ? numberOne / numberTwo : null;
            default: return Result;
        }
    }

    public static void main(String[] args) {
        double result = calculate(3.2,"+", 8);
        double result1 = calculate(-3,"*", 0);
        System.out.println(result);
        System.out.println(result1);
    }
}
