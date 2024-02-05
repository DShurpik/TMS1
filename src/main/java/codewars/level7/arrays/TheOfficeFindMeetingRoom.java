package codewars.level7.arrays;

public class TheOfficeFindMeetingRoom {
    public static Object meeting(char[] x) {
        int index = -1;
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == 'O') {
                index = i;
            }
        }
        return index >= 0 ? index : "None available!";
    }

    public static void main(String[] args) {
        Object result = meeting(new char[] {'O','X','X','X','X'});
        System.out.println(result.toString());
    }
}
