package tms.lesson8HomeWork.Task3Ver1;

import java.util.Scanner;

public class ShapeService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter height ");
        rectangle.setHeight(sc.nextDouble());
        System.out.print("Enter width ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.printHeight();
        rectangle.printWidth();
        rectangle.printSquare();
        System.out.println(" ");

        Circle circle = new Circle();
        System.out.print("Enter radius ");
        circle.setRadius(sc.nextDouble());
        circle.printRadius();
        circle.printPi();
        circle.printSquareCircle();
    }
}

