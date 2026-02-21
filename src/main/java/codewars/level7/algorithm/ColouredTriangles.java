package codewars.level7.algorithm;

public class ColouredTriangles {
    public static void main(String[] args) {
        System.out.println(triangle("RBRGBRB"));                // G
        System.out.println(triangle("RBRGBRBGGRRRBGBBBGG"));    // G
        System.out.println(triangle("RGBG"));                   // B
    }

    public static char triangle(final String row) {
        StringBuilder stringBuilder = new StringBuilder();
        if (row.length() == 1) return row.charAt(0);
        String s = row;
        while (s.length() > 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    stringBuilder.append(s.charAt(i));
                } else if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'G' ||
                        s.charAt(i) == 'G' && s.charAt(i + 1) == 'R') stringBuilder.append('B');
                else if (s.charAt(i) == 'G' && s.charAt(i + 1) == 'B' ||
                        s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') stringBuilder.append('R');
                else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'R' ||
                        s.charAt(i) == 'R' && s.charAt(i + 1) == 'B') stringBuilder.append('G');

            }
            s = stringBuilder.toString();
            stringBuilder.setLength(0);
        }
        return s.charAt(0);
    }
}
