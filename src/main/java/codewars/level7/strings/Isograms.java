package codewars.level7.strings;
// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("moOse"));
    }

    public static boolean  isIsogram(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        boolean isIsogram = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isIsogram = false;
                }
            }
        }
        return isIsogram;
    }

    public static boolean  isIsogram1(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
