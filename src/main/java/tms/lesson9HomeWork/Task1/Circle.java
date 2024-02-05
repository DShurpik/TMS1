package tms.lesson9HomeWork.Task1;


public class Circle extends Shape {
    public void perimetrCircle(){
        System.out.println("perimetr circle = " + 2 * Circle.super.getRadius() * getPi());
    }
}
