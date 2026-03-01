package codewars.level7.strings;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("()"));     //  true
        System.out.println(validParentheses("(())"));   //  true
        System.out.println(validParentheses("(()"));    //  false
        System.out.println(validParentheses("())"));   //  false
    }

    public static boolean validParentheses(String parenStr) {
        int count = 0;
        for (char c : parenStr.toCharArray()) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
