package codewars.level7.strings;

public class CatAndMouse {
    public static void main(String[] args) {
        System.out.println(catMouse("C....m"));
        System.out.println(catMouse("C..m"));
    }

    public static String catMouse(String x){
        return x.length() <= 5 ? "Caught!" : "Escaped!";
    }
}
