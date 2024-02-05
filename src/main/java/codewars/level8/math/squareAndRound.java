package codewars.level8.math;

public class squareAndRound {
    public static void main(String[] args) {

        System.out.println(squareArea(14.05));

        System.out.println(squareArea(1.62));


    }

    public static double squareArea(double A){
        //your code;
        double R =  (A * 4) / (2 * Math.PI);
        double S = Math.pow(R, 2);
        return Math.round(S * 100)/100D;
    }
}
