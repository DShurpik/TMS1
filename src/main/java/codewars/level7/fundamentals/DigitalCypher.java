package codewars.level7.fundamentals;

import java.util.Arrays;

public class DigitalCypher {
    public static void main(String[] args) {
        int[] arr = encode("scout", 1939); // {20, 12, 18, 30, 21}
        System.out.println(Arrays.toString(arr));
    }

    public static int[] encode(String message, int key) {
        String[] arr = String.valueOf(key).split("");
        int[] keyArr = new int[message.length()];
        int keyIndex = 0;
        for (int i = 0; i < keyArr.length; i++) {
            keyArr[i] = Integer.parseInt(arr[keyIndex]);
            keyIndex = (keyIndex + 1) % arr.length;
        }
        int[] res = new int[message.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Character.getNumericValue(message.charAt(i)) - 9;
        }

        for (int i = 0; i < res.length; i++) {
            res[i] += keyArr[i];
        }
        return res;
    }
}
