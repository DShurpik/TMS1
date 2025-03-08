package codewars.level7.strings;

import java.util.Arrays;

public class DotCalculator {
    public static void main(String[] args) {
        System.out.println(calc("..... - ."));
        System.out.println(calc("..... // ."));
        System.out.println(calc("..... * ."));
        System.out.println(calc("..... // .."));
    }

    public static String calc(String txt){
        String[] tokens = txt.split(" ");
        int left = tokens[0].length();
        int right = tokens[2].length();
        String operator = tokens[1];
        int res = 0;
        switch (operator) {
            case "+":
                res = left + right;
                break;
            case "-":
                res = left - right;
                break;
            case "*":
                res = left * right;
                break;
            case "//":
                res = left / right;
                break;
        }
        return ".".repeat(res);
    }
}
