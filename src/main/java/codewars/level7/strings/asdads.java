package codewars.level7.strings;

import java.util.Scanner;

public class asdads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double d= root2 * root1;
        System.out.format(root1 + root2 + " " + "%.1f", d);

    }
}
