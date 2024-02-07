package codewars.level7.fundamentals;

public class ReverseBitsInteger {
    public static int reverseBits(int n){
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }

    public static void main(String[] args) {
        int res = reverseBits(417);
        System.out.println(res);
    }
}
