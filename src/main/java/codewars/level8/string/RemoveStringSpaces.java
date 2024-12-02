package codewars.level8.string;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(noSpace("8aaaaa dddd r     "));
        System.out.println(noSpace("jfBm  gk lf8hg  88lbe8 "));
    }

    public static String noSpace(final String x) {
        String[] str = x.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }

    static String noSpace1(final String x) {
        return x.replace(" ", "");
    }

    static String noSpace2(final String x) {
        String res = "";
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) != ' ')
                res += x.charAt(i);
        }
        return res;
    }
}
