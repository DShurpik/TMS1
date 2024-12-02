package codewars.level8.math;

public class SchoolPaperwork {
    public static void main(String[] args) {
        System.out.println(paperWork(-5,5));
        System.out.println(paperWork(0,5));
        System.out.println(paperWork(5,5));
    }

    public static int paperWork(int n, int m) {
        return (n < 0) || (m < 0) ? 0 : n * m;
    }
}
