package codewars.level7.arrays;

import java.util.Arrays;

public class DroneFlyBy {

    public static void main(String[] args) {
        System.out.println(flyBy("xxxxxxxxxxxxxxx", "=========T"));
    }

    public static String flyBy(String lamps, String drone){
        if (lamps.length() < drone.length()) return lamps.replace("x", "o");
        String[] arr = lamps.split("");
        for (int i = 0; i < drone.length(); i++) {
            arr[i] = "o";
        }
        StringBuilder res = new StringBuilder();
        for (String s : arr) res.append(s);
        return res.toString();
    }
}
