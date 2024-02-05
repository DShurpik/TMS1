package codewars.level8.algoritmes;

public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(1)); //1
        System.out.println(toBinary(5)); //101
        System.out.println(toBinary(11));//1011
    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
