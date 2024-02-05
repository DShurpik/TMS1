package codewars.level7.strings;

// https://www.codewars.com/kata/6512b3775bf8500baea77663/train/java

public class FromA_to_Z {
    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("a-z")); // abcdefghijklmnopqrstuvwxyz
        System.out.println(gimmeTheLetters("h-o")); // hijklmno
    }

    public static String gimmeTheLetters(String s){
        StringBuilder str = new StringBuilder();
        for (int i = s.charAt(0); i <= s.charAt(2); i++) {
            str.append((char) i);
        }
        return str.toString();
    }
}
