package codewars.level7.fundamentals;
// https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(solve("code")); // code
        System.out.println(solve("CODe")); // CODE
        System.out.println(solve("Code")); // code
    }

    public static String solve(final String str) {
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else {
                upperCount++;
            }
        }
        return lowerCount >= upperCount ? str.toLowerCase() : str.toUpperCase();
    }
}
