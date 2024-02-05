package tms.lesson8HomeWork.Task3Ver2;

public class Circle implements Shape {

    protected double radius;
    protected double pi = 3.1415;

    public Circle(double radius){
        this.radius = radius;
            }

    @Override
    public void getArea() {
        System.out.println("Squad circle " + radius * radius * pi);
    }
}
