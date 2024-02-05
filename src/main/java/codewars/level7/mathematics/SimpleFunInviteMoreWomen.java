package codewars.level7.mathematics;

public class SimpleFunInviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return sum > 0;
    }

    public static void main(String[] args) {
        boolean wom = inviteMoreWomen(new int[] {1, -1});
        System.out.println(wom);
    }
}
