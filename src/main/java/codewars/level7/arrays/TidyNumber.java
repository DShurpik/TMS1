package codewars.level7.arrays;



public class TidyNumber {
    public static boolean tidyNumber(int number) {
        String[] arr = Integer.toString(number).split("");
        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b1 = tidyNumber(13579); // true
        boolean b2 = tidyNumber(12576); // false
        System.out.println(b1);
        System.out.println(b2);
    }
}
