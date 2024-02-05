package codewars.level7.fundamentals;

public class GoingToTheCinema {
    public static int movie(int card, int ticket, double perc) {
        int count = 0;
        double sumCard = card;
        double sumTicket = 0;
        while (Math.ceil(sumCard) >= sumTicket) {
            sumCard += ticket * Math.pow(perc, ++count);
            sumTicket += ticket;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = movie(100, 10, 0.95); // 24
        int result1 = movie(500, 15, 0.9); // 43
        System.out.println(result);
        System.out.println(result1);
    }
}
