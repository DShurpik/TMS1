package codewars.level7.mathematics;

public class SpecialNumber {
    public static String specialNumber(int number) {
        boolean special = true;
        String[] res = Integer.toString(number).split("");
        int[] result = new int[res.length];
        for (int i = 0; i < res.length; i++) {
            result[i] = Integer.parseInt(res[i]);
            if (result[i] > 5) {
                special = false;
                break;
            }
        }
        return special ? "Special!!" : "Not";
    }

    public static void main(String[] args) {
        String res = specialNumber(24);
        System.out.println(res);
    }
}
