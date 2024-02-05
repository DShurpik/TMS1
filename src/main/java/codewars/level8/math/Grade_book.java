package codewars.level8.math;

public class Grade_book {
    public static void main(String[] args) {
        System.out.println(getGrade(95,90,93));
        System.out.println(getGrade(82,85,87));
        System.out.println(getGrade(48,55,52));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        return avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';
    }
}
