package codewars.level7.strings;
// https://www.codewars.com/kata/57f759bb664021a30300007d/train/java

public class Switcheroo {
    public static void main(String[] args) {
        System.out.println(switcheroo("bbbacccabbb")); // aaabcccbaaa
        System.out.println(switcheroo("bac")); // abc
    }

    public static String switcheroo(String x) {
        String str = new String();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                str = str + 'b';
            } else if (x.charAt(i) == 'b') {
                str = str + 'a';
            } else {
                str = str + 'c';
            }
        }
        return str;
    }
}
