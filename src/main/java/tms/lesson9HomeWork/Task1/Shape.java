package tms.lesson9HomeWork.Task1;

import java.util.Scanner;

public abstract class Shape {
    Scanner sc = new Scanner(System.in);

    private double radius ;
    private double width ;
    private double lenght ;
    private double pi = 3.1415;
    public double getPi(){
        this.pi = pi;
        return pi;
    }
    public void setRadius() {
        this.radius = sc.nextDouble();
    }
    public double getRadius(){
        return radius;
    }
    public void setWidth() {
        this.width = sc.nextDouble();
    }
    public double getWidth(){
        return width;
    }
    public void setLenght() {
        this.lenght = sc.nextDouble();
    }
    public double getLenght(){
        return lenght;
    }

}
