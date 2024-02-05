package codewars.level8.fundamentals;

public class HowOldWillIBeIn2099 {
    public static void main(String[] args) {
        System.out.println(calculateAge(2012, 2016)); // You are 4 years old.
        System.out.println(calculateAge(2000, 1990)); // You will be born in 10 years.
        System.out.println(calculateAge(3400, 3400)); // You were born this very year
    }

    public static String calculateAge(int birth, int yearTo) {
        int res = yearTo - birth;
        if (res > 0 & res != 1) {
            return "You are " + res + " years old.";
        } else if (res == 0) {
            return "You were born this very year!";
        } else if (res == 1) {
            return "You are 1 year old.";
        } else if (res == -1) {
            return "You will be born in 1 year.";
        }
        else return "You will be born in " + Math.abs(res) + " years.";
    }
}
