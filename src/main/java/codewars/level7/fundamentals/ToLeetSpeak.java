package codewars.level7.fundamentals;

public class ToLeetSpeak {
    static String toLeetSpeak(final String speak) {
        return speak.replace("A", "@").replace("B", "8").replace("C", "(").replace("E", "3").replace("G", "6").replace("H", "#").replace("I", "!").replace("L", "1").replace("O", "0").replace("S", "$").replace("T", "7").replace("Z", "2");
    }

    public static void main(String[] args) {
        String result = toLeetSpeak("LEET");
        System.out.println(result);

        String result1 = toLeetSpeak("LOREM IPSUM DOLOR SIT AMET");
        System.out.println(result1);
    }
}
