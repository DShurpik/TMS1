package codewars.level8.fundamentals;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors")); // pl1 won
        System.out.println(rps("paper", "scissors")); // pl2 won
        System.out.println(rps("rock", "rock")); // Draw
    }

    public static String rps(String p1, String p2) {
        if (p1.equals("rock") & p2.equals("scissors") ||
                p1.equals("scissors") & p2.equals("paper") ||
                p1.equals("paper") & p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("scissors") & p2.equals("rock") ||
                p1.equals("paper") & p2.equals("scissors") ||
                p1.equals("rock") & p2.equals("paper")) {
            return "Player 2 won!";
        } else return "Draw!";
    }

    public static String rps1(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}
