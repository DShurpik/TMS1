package codewars.level8.fundamentals;

public class FuelCalculatorTotalCost {
    public static void main(String[] args) {
        System.out.println(fuelPrice(5, 1.23d)); // 5.65
        System.out.println(fuelPrice(8, 2.50d)); // 18.40
        System.out.println(fuelPrice(5, 5.60d)); // 27.50

    }

    public static double fuelPrice(int litres, double pricePerLitre) {
        if (litres >= 2 & litres < 4) {
            double total = (double) litres * pricePerLitre - ((double) litres * 0.05);
            return Math.round(total * 100) / 100d;
        }
        if (litres >= 4 & litres < 6) {
            double total = (double) litres * pricePerLitre - ((double) litres * 0.10);
            return Math.round(total * 100) / 100d;
        }
        if (litres >= 6 & litres < 8) {
            double total = (double) litres * pricePerLitre - ((double) litres * 0.15);
            return Math.round(total * 100) / 100d;
        }
        if (litres >= 8 & litres < 10) {
            double total = (double) litres * pricePerLitre - ((double) litres * 0.20);
            return Math.round(total * 100) / 100d;
        }
        double total = (double) litres * pricePerLitre - ((double) litres * 0.25);
        return Math.round(total * 100) / 100d;
    }
}
