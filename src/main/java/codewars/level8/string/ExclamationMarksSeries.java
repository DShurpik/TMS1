package codewars.level8.string;

public class ExclamationMarksSeries {

    public static void main(String[] args) {
        System.out.println(remove("!!!Hi !!hi!!! !hi", 100));
        System.out.println(remove("!Hi", 1));
        System.out.println(remove("!!!Hi !!hi!!! !hi", 3));
    }

    public static String remove(String s, int n){
        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}
