package codewars.level7.strings;
// https://www.codewars.com/kata/5637b03c6be7e01d99000046/train/java
public class PasswordMaker {
    public static void main(String[] args) {
        String a1 = "Give me liberty or give me death";
        String a2 = "Keep Calm and Carry On";
        String a3 = "";
        System.out.println(makePassword(a1)); // Gml0gmd
        System.out.println(makePassword(a2)); // KCaC0
        System.out.println(makePassword(a3)); // ""
    }

    public static String makePassword(String phrase){
        if (phrase.equals("")) {
            return "";
        }
        String[] arr = phrase.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i].charAt(0));
        }
        String result = str.toString()
                .replaceAll("[iI]", "1")
                .replaceAll("[oO]", "0")
                .replaceAll("[sS]", "5");
        return result;
    }
}
