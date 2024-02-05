package codewars.level8.string;

public class AllStarCodeChallenge {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o')); // 1
        System.out.println(strCount("Hello", 'l')); // 2
        System.out.println(strCount("",'z')); // 0
    }

    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
