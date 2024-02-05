package tms.lesson8HomeWork.Task3Ver1;

public class Circle extends Shape {

    public double radius;
    public double pi = 3.1415;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printRadius() {
        System.out.println("Radius " + radius);
    }

    public void printPi() {
        System.out.println("P " + pi);
    }

    public void printSquareCircle() {
        System.out.println("Square circle = " + radius * radius * pi);
    }
}

