package codewars.level8.array;

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"})); //30
    }

    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            String[] arr = games[i].split(":");
            if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
                sum = sum + 3;
            } else if (Integer.parseInt(arr[0]) == Integer.parseInt(arr[1])) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int points1(String[] games) {
        int sum = 0;
        for (String s : games) {
            char x = s.charAt(0),
                    y = s.charAt(2);
            sum += x > y ? 3 : x == y ? 1 : 0;
        }
        return sum;
    }
}
