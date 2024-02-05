package codewars.level7.mathematics;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        String temp = Integer.toString(num);
        String[] s = temp.split("");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= arr[i]; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        return sum == num ? "Strong Number" : "Not a Strong Number";
    }

    public static void main(String[] args) {
        String res1 = isStrongNumber(185); // not strong
        String res2 = isStrongNumber(145); // strong

        System.out.println(res1);
        System.out.println(res2);
    }
}
