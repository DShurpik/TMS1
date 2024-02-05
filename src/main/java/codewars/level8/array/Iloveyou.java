package codewars.level8.array;

public class Iloveyou {
    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
        System.out.println(howMuchILoveYou(2));
        System.out.println(howMuchILoveYou(3));
        System.out.println(howMuchILoveYou(4));
        System.out.println(howMuchILoveYou(5));
        System.out.println(howMuchILoveYou(6));
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] arr = new String[] {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        int index = (nb_petals - 1) % arr.length;
        return arr[index];
    }
}
