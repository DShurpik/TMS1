package codewars.level8.math;

public class BasicMathematicalOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));//11
        System.out.println(basicMath("-", 15, 18));//-3
        System.out.println(basicMath("*", 5, 5));//25
        System.out.println(basicMath("/", 49, 7));//7
    }
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
        }
        return 0;
    }
}
