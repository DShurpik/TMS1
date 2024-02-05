package codewars.level7.fundamentals;
// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx")); // true
        System.out.println(getXO("zpzpzpp")); // true
        System.out.println(getXO("ooxXm")); //true
        System.out.println(getXO("xooxx")); // false
    }

    public static boolean getXO (String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'x') countX++;
            if (arr[i] == 'o') countO++;
        }
        return countO == countX;
    }

    public static boolean getXO1 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }
}
