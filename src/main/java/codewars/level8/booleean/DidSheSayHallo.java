package codewars.level8.booleean;

public class DidSheSayHallo {

    public static void main(String[] args) {
        System.out.println(validateHello("Hello"));
        System.out.println(validateHello("hello"));
    }

    public static boolean validateHello(String greetings){
        String[] hi = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        for (int i = 0; i < hi.length; i++) {
            if (greetings.toLowerCase().contains(hi[i])) {
                return true;
            }
        }
        return false;
        }
}
