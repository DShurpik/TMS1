package codewars.level7.fundamentals;

public class RegexpBasics {

    public static void main(String[] args) {
        System.out.println(isLetter("ab"));     // false
        System.out.println(isLetter("X"));      // true
    }

    public static boolean isLetter(String s) {
        return s.matches("[A-Za-z]");
    }
}
