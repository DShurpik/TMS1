package codewars.level7.lists;

public class Digitize {
    public static int[] digitize(int n){
        String[] res = Integer.toString(n).split("");
        int[] result = new int[res.length];
        for (int i = 0; i < res.length; i++) {
            result[i] = Integer.parseInt(res[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = digitize(8675309);
        for (int i : res) {
            System.out.print(i + ", ");
        }
    }
}
