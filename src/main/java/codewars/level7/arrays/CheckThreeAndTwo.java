package codewars.level7.arrays;

public class CheckThreeAndTwo {
    // https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java
    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' })); // true
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' })); // false
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' })); // false
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                countA++;
            } else if (chars[i] == 'b') {
                countB++;
            } else if (chars[i] == 'c') {
                countC++;
            }
        }

        return (countA == 3 && countB == 2) || (countA == 2 && countB == 3) ||
                (countA == 3 && countC == 2) || (countA == 2 && countC == 3) ||
                (countB == 3 && countC == 2) || (countB == 2 && countC == 3);
    }
}
