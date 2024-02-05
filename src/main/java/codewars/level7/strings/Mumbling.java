package codewars.level7.strings;
// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd")); // A-Bb-Ccc-Dddd
        System.out.println("----------");
        System.out.println(accum("RqaEzty")); // R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy
    }

    public static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
            if (i < s.length() - 1) {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    public static String accum1(String s) {
        String result = "";
        char[] letters = s.toCharArray();

        for(int i = 0; i < letters.length; i++){
            String curr = String.valueOf(letters[i]);

            result += curr.toUpperCase() + curr.toLowerCase().repeat(i);
            result += i != letters.length - 1 ? "-" : "";
        }

        return result;
    }
}
