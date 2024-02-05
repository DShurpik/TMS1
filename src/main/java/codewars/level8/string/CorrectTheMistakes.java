package codewars.level8.string;

public class CorrectTheMistakes {
    public static void main(String[] args) {
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5"));
        System.out.println(correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")); // "URSULA K. LE GUIN - TALES FROM EARTHSEA"
        System.out.println(correct1("501 105 015 051"));
    }

    public static String correct(String string) {
        String s1 = string.replaceAll("5", "S");
        String s2 = s1.replaceAll("0", "O");
        String s3 = s2.replaceAll("1", "I");
        return s3;
    }

    public static String correct1(String string) {
        return string.replace("5","S").replace("0", "O").replace("1","I");
    }
}
