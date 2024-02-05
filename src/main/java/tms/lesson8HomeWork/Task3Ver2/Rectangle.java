package tms.lesson8HomeWork.Task3Ver2;

public class Rectangle implements Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Squad rectangle " + width * height);
    }
}
