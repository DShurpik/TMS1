package codewars.level8.booleean;

public class Be_Concise_The_Ternary_Operator {

    public static void main(String[] args) {
        System.out.println(describeAge(12));
        System.out.println(describeAge(15));
        System.out.println(describeAge(25));
        System.out.println(describeAge(90));
    }

    public static String describeAge(int age) {
        return age <= 12 ? "You're a(n) kid" : age <=17 ? "You're a(n) teenager" : age <= 64 ? "You're a(n) adult" : "You're a(n) elderly";
    }

}
