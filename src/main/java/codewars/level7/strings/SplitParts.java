package codewars.level7.strings;

public class SplitParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (count != partLength ) {
                str.append(s.charAt(i));
            } else {
                str.append(s.charAt(i)).append(" ");
                count = 0;
            }
            count++;
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        String res = splitInParts("supercalifragilisticexpialidocious", 3);
        System.out.println(res);
    }
}
