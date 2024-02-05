package codewars.level8.oop;
/** https://www.codewars.com/kata/54fe05c4762e2e3047000add */
public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }
    public boolean isWorthIt() {
        return draft - (double) crew * 1.5 > 20 ? true : false;
        // OR   return draft - (double) crew * 1.5 > 20  возвращает сразу булеан
    }

    public static void main(String[] args) {
        Ship titanic = new Ship(15, 10);
        System.out.println(titanic.isWorthIt());
        Ship ship = new Ship(40, 5);
        System.out.println(ship.isWorthIt());
    }

}
