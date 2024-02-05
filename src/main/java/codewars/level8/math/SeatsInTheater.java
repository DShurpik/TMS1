package codewars.level8.math;

public class SeatsInTheater {
    public static void main(String[] args) {
        System.out.println(seatsInTheater(16,11,5,3)); // 96
        System.out.println(seatsInTheater(13,6,8,3)); // 18
        System.out.println(seatsInTheater(1000,1000,1000,1000)); // 0
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }
}
