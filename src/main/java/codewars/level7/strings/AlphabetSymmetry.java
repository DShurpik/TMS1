package codewars.level7.strings;
// https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0/train/java

public class AlphabetSymmetry {
    public static void main(String[] args) {
        int[] arr = solve(new String[]{"abode","ABc","xyzD"}); // {4,3,1}
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solve(String[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j == Character.toLowerCase(arr[i].charAt(j)) - 'a') {
                    res[i]++;
                }
            }
        }
        return res;
    }
}
