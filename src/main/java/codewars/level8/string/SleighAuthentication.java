package codewars.level8.string;

public class SleighAuthentication {
    public static void main(String[] args) {
        System.out.println(authenticate("Santa Claus", "Ho Ho Ho!"));
        System.out.println(authenticate("Santa Claus", "Ho Ho!"));
    }

    public static Boolean authenticate(String name, String password){
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}
