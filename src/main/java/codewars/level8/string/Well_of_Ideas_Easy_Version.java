package codewars.level8.string;

public class Well_of_Ideas_Easy_Version {
    public static void main(String[] args) {
        System.out.println(well(new String[] {"bad", "bad", "bad"})); // Fail!
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad"})); //  Publish
        System.out.println(well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));  //  I smell a series!
    }

    public static String well(String[] x) {
        int good = 0;
        for (String elem : x) {
            if (elem.equals("good")) {
                good++;
            }
        }
        return good == 0 ? "Fail!" : good == 1 || good == 2? "Publish!" : "I smell a series!";
    }
}
