package tms.lesson8HomeWork.Task3Ver2;

import java.util.Scanner;

public class SquadSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга 1");
        double inRadius = scanner.nextDouble();
        Circle circle = new Circle(inRadius);
        circle.getArea();


        Circle circle1 = new Circle(5);
        circle1.getArea();

        System.out.println(" ");

        Rectangle rectangle = new Rectangle(4,5);
        rectangle.getArea();
    }
}
