package codewars.level7.strings;

public class Covfefe {
    public static void main(String[] args) {
        System.out.println(covfefe("coverage"));
        System.out.println(covfefe("nothing"));
        System.out.println(covfefe("coverage coverage"));
    }

    public static String covfefe(String tweet) {
        for (int i = 0; i < tweet.length() - 4; i++) {
            if (tweet.substring(i, i + 4).equals("erag")) {
                return tweet.replaceAll("erag", "fef");
            }
        }
        return tweet + " covfefe";
    }
}
