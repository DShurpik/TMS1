package codewars.level7.strings;
// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra")); // 5
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao")); // 13
    }

    public static int getCount(String str) {
        int count = 0;
        for (Character c : str.toCharArray()) {
            if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                count++;
            }
        }
        return count;
    }
}
